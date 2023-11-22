package com.example.mapper;

import com.example.Entities.Inscription;
import com.example.dto.DtoRequestInscription;
import com.example.dto.DtoResponseInscription;

public class MapperInsciption {

	public DtoResponseInscription  InscriptiontoResponse(Inscription inscription)
	{
		DtoResponseInscription jh = new DtoResponseInscription();
		
		jh.setIdConcour(inscription.getIdConcour());
		jh.setIdEtudiant(inscription.getIdEtudiant());
		jh.setId(inscription.getId());
		return jh;
	}
	
	public Inscription  requesttoInscription(DtoRequestInscription dtoRequestInscription)
	{
		Inscription jh = new Inscription();
		
		jh.setIdConcour(dtoRequestInscription.getIdConcour());
		jh.setIdEtudiant(dtoRequestInscription.getIdEtudiant());
		return jh;
	}
}
