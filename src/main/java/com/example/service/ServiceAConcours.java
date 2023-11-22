package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.Mappers.MapperEtudiant;
import com.app.reposotiries.RepoEtudiant;

public class ServiceAConcours {

	@Autowired
	RepoEtudiant etudiantRepo;
	@Autowired 
	MapperEtudiant mapperEtudiant;
	
}
