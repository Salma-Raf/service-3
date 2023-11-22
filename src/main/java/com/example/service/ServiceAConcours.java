package com.example.service;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;

import com.app.Mappers.MapperEtudiant;
import com.app.reposotiries.RepoEtudiant;

public class ServiceAConcours {

	@Autowired
	RepoEtudiant etudiantRepo;
	@Autowired 
	MapperEtudiant mapperEtudiant;
	
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entities.Concours;
import com.example.dto.DTOResponseConcours;
import com.example.dto.DtoRequestConcours;
import com.example.mapper.MapperConcours;
import com.example.repo.RepoConcours;
import com.example.webException.WebException500;



@Service
public class ServiceAConcours {
	@Autowired
	private RepoConcours repoConcours;
	@Autowired
	private MapperConcours mapperConcours ;
	public List <Concours> getConcours(){
		return repoConcours.findAll();
	}
	
	public DTOResponseConcours AddConcours(DtoRequestConcours dtoRequestConcours){
		Concours concours= mapperConcours.requestConcoursToConcours(dtoRequestConcours);
		 concours=repoConcours.save(concours);
		 return mapperConcours.concoursToResponseDto(concours);
	}

	public void deleteAdmin(Integer Id) {
		Admin admin2=repoAdmin.findById(Id).orElse(null);
		if(admin2==null) { throw new Exception404("admin not found");}
	   repoAdmin.delete(admin2);
	}
	
	public DTOResponseAdmin ModifyAdmin(DtoRequestAdmin dtoRequestAdmin,Integer Id){
		Admin admin2=repoAdmin.findById(Id).orElse(null);
		if(admin2==null) { throw new Exception404("admin not found"); }
		Admin admin= mapperAdmin.requestAdminToAdmin(dtoRequestAdmin);
	
		return mapperAdmin.adminToResponseDto(repoAdmin.save(admin));
	}
	public void AssignRole(Admin admin) {
		
	}
>>>>>>> 73d6617ed08d2c990b2cc9e65e9882d243e0b22d
}
