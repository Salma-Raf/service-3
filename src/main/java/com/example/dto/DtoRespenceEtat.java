package com.example.dto;

import com.example.Entities.Concours;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoRespenceEtat {
	
	private String etat;
	private Integer id_concour;
	private Integer id_etudiant;
}
