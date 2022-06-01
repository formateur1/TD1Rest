package com.inti.TD1Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.TD1Rest.model.Ecole;

@Repository
public interface EcoleRepository extends JpaRepository<Ecole, Integer>
{
	@Query(value = "select ec.* from etudiant e, ecole ec \r\n"
			+ "where e.id_ecole = ec.id and e.email=:mail", nativeQuery = true)
	Ecole findSchoolByEmail(@Param("mail") String mail);
	
	@Query(value = "select ec.* from etudiant e, ecole ec \n"
			+ "where e.id_ecole = ec.id and e.nom=:nom and e.prenom=:prenom", nativeQuery = true)
	Ecole findSchoolByNomAndPrenom(@Param("nom") String nom, @Param("prenom") String prenom);

}
