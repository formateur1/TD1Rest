package com.inti.TD1Rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.TD1Rest.model.Etudiant;
import com.inti.TD1Rest.repository.EtudiantRepository;

@RestController
public class EtudiantController
{
	@Autowired
	EtudiantRepository etudiantRepository;
	
	@GetMapping("/students")
	public ResponseEntity<List<Etudiant>> getAllStudents()
	{
		return new ResponseEntity<List<Etudiant>>(etudiantRepository.findAll(), HttpStatus.OK);
	}
	

}
