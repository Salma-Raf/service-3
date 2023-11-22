package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entities.Concours;

public interface RepoConcours  extends JpaRepository<Concours, Integer>{
	public Concours findById(String Id);
}
