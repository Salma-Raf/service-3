package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entities.Inscription;
public interface RepoInscription  extends JpaRepository<Inscription, Integer>{
	

}
