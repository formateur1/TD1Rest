package com.inti.TD1Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.TD1Rest.model.Ecole;

@Repository
public interface EcoleRepository extends JpaRepository<Ecole, Integer>
{

}
