package com.inti.TD1Rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.TD1Rest.model.Professeur;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Integer>
{
	@Query(value = "select p.* from professeur p, ecole e, professeur_ecole pe\n"
			+ "where p.id = pe.id_prof and e.id = pe.id_ecole and e.id=:id \n"
			+ "order by salaire;", nativeQuery = true)
	List<Professeur> sortProfSalaireBySchoolId(@Param("id") int id);

}
