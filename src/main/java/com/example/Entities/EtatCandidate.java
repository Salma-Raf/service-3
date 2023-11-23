package com.example.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtatCandidate {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer Id;
	@Column()
	private String etat;
	@ManyToOne
	@JoinColumn(name = "id_concour")
	private Concours concour;
	private Integer id_concour;
	@Column()
	private Integer id_etudiant;
	
}
