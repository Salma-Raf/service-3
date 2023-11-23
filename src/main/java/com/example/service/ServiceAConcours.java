package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Service;


import com.example.Entities.Concours;
import com.example.dto.DTOResponseConcours;
import com.example.dto.DtoRequestConcours;
import com.example.mapper.MapperConcours;
import com.example.repo.RepoConcours;
import com.example.exception.Exception404;
>>>>>>> 3979e11668c06b387d6faac543a9470ef5ac7316


public class ServiceAConcours {

<<<<<<< HEAD
	
	
=======
	public void deleteConcours(Integer Id) {
		Concours concours2=repoConcours.findById(Id).orElse(null);
		if(concours2==null) { throw new Exception404("concours not found");}
	   repoConcours.delete(concours2);
	}
	
	
	public DTOResponseConcours ModifyConcours(DtoRequestConcours dtoRequestConcours,Integer Id){
		Concours concours2=repoConcours.findById(Id).orElse(null);
		if(concours2==null) { throw new Exception404("concours not found"); }
		Concours concours= mapperConcours.requestConcoursToConcours(dtoRequestConcours);
	
		return mapperConcours.concoursToResponseDto(repoConcours.save(concours));
	}
	
>>>>>>> 3979e11668c06b387d6faac543a9470ef5ac7316
}
