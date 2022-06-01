package com.inti.TD1Rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.TD1Rest.model.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>
{
	@Query(value = "select * from etudiant where id_ecole=:idEcole", nativeQuery = true)
	List<Etudiant> findByIdEcole(@Param("idEcole") int idEcole);
	
	@Query(value = "select * from etudiant where id_ecole in (\n"
			+ "select id from ecole where ville=\"Lyon\");", nativeQuery = true)
	List<Etudiant> findByVille();
	
	@Query(value = "select e.* from professeur p, etudiant e, professeur_etudiant pe\n"
			+ "where p.id = pe.id_prof and e.id = pe.id_etu and p.id=:id", nativeQuery = true)
	List<Etudiant> findByProf(@Param("id") int id);
}
