package com.inti.TD1Rest.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.inti.TD1Rest.model.Etudiant;
import com.inti.TD1Rest.model.Professeur;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ProfesseurRepositoryTests {
	
	@Autowired
	ProfesseurRepository professeurRepository;
	
	Professeur p1;
	
	@BeforeEach
	public void setUp() {
		p1 = new Professeur("Toto", "Titi", 2136.25);
	}
	
	@Test
	public void testGetAllStudents() {
		// Given
		int id = 1;
		
		// When
		List<Professeur> lisProfesseurs = professeurRepository.sortProfSalaireBySchoolId(id);
		
		// Then
		assertThat(lisProfesseurs).isNotEmpty();
	}

}
