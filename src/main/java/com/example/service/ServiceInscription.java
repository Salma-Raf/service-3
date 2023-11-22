package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.mapper.MapperInsciption;
import com.example.repo.RepoInscription;

@Service
public class ServiceInscription {
	@Autowired
	MapperInsciption mapperInsciption;
	@Autowired 
	RepoInscription repoInscription;
	
	public void deleteEtudiant(Integer id ){
		Etudiant etudiant = repoInscription.findById(id).orElse(null); 
		if(etudiant==null) { throw new Exception404("etudiant not found");}
		etudiantRepo.delete(etudiant);	
		}
	public List<Etudiant> getAll(){
		return etudiantRepo.findAll();
	}
	public  DtoRespenseEtudiant addCompte(DtoRequestEtudiant dtoRequestEtudiant) {	
		
		Etudiant etudiant=	mapperEtudiant.requestEtudiantToEtudiant(dtoRequestEtudiant);
		etudiant=etudiantRepo.save(etudiant);
		 return mapperEtudiant.EtudiantToEtudiantResponseDto(etudiant);
		}
}
