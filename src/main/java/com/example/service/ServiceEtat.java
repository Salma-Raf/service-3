package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Entities.EtatCandidate;
import com.example.dto.DtoRequestEtat;
import com.example.dto.DtoRespenceEtat;
import com.example.mapper.MapperEtat; // Make sure to create a MapperEtat class
import com.example.repo.RepoEtat;
import com.example.exception.Exception404;

import java.util.List;

@Service
public class ServiceEtat {
    @Autowired
    private RepoEtat repoEtat;
    @Autowired
    private MapperEtat mapperEtat;

    public List<EtatCandidate> getEtats() {
        return repoEtat.findAll();
    }

    public DtoRespenceEtat addEtat(DtoRequestEtat dtoRequestEtat) {
        EtatCandidate etatCandidate = mapperEtat.requestEtatToEtat(dtoRequestEtat);
        etatCandidate = repoEtat.save(etatCandidate);
        return mapperEtat.etatToResponseEtat(etatCandidate);
    }

    public void deleteEtat(Integer id) {
        EtatCandidate etatCandidate = repoEtat.findById(id).orElse(null);
        if (etatCandidate == null) {
            throw new Exception404("EtatCandidate not found");
        }
        repoEtat.delete(etatCandidate);
    }

    public DtoRespenceEtat modifyEtat(DtoRequestEtat dtoRequestEtat, Integer id) {
        EtatCandidate etatCandidate = repoEtat.findById(id).orElse(null);
        if (etatCandidate == null) {
            throw new Exception404("EtatCandidate not found");
        }
        etatCandidate = mapperEtat.requestEtatToEtat(dtoRequestEtat);
        return mapperEtat.etatToResponseEtat(repoEtat.save(etatCandidate));
    }
}
