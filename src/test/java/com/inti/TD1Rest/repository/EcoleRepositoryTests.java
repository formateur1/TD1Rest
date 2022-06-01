package com.inti.TD1Rest.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.inti.TD1Rest.model.Ecole;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EcoleRepositoryTests {
	
	@Autowired
	EcoleRepository ecoleRepository;
	
	Ecole e1;
	
	@BeforeEach
	public void setUp() {
		e1 = new Ecole("Inti", "adresse", "cp", "ville");
	}
	
	@Test
	public void testGetSchollByNomAndPrenom() {
		// Given
		
		// When
		Ecole ecole = ecoleRepository.findSchoolByNomAndPrenom("Jean", "Pierre");
		
		// Then
		assertThat(ecole).isNotNull();
		assertThat(ecole.getNom()).isEqualTo("Inti");
	}

}
