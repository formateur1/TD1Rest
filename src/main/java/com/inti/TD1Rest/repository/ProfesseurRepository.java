package com.inti.TD1Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.TD1Rest.model.Professeur;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Integer>
{

}
