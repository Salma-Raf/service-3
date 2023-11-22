package com.example.Entities;









import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Concours implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer Id;
	private String libelle;
	private Date jourPassage;
	private String nomSalle;
	private Integer duree;
	private String etat;
	private Integer maxAge;
	private Integer minNote;
	private Boolean hasBacLibre;
	private String Categorie;

}
