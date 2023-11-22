package com.example.dto;

import com.app.DTO.CompteResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoRequestInscription {
	private Integer  IdEtudiant;
    private Integer IdConcour;
}
