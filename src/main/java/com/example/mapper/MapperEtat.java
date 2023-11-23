package com.example.mapper;

import com.example.Entities.EtatCandidate;
import com.example.dto.DtoRequestConcours;
import com.example.dto.DtoRequestEtat;
import com.example.dto.DtoRespenceEtat;

public class MapperEtat {

	public EtatCandidate requestEtatToEtat(DtoRequestEtat dtoRequestEtat) {
		EtatCandidate condidate = new EtatCandidate();
		
		condidate.setEtat(dtoRequestEtat.getEtat());
		condidate.setId_concour(dtoRequestEtat.getId_concour());
		condidate.setId_etudiant(dtoRequestEtat.getId_etudiant());
		return condidate;

	}
		public DtoRespenceEtat etatToResponseEtat(EtatCandidate  etat) {
			DtoRespenceEtat dtoRespenceEtat =new DtoRespenceEtat();
			
			dtoRespenceEtat.setId_etudiant(etat.getId_etudiant());
			dtoRespenceEtat.setId_concour(etat.getId_concour());
			dtoRespenceEtat.setEtat(etat.getEtat());
			return dtoRespenceEtat;
		} 
}
