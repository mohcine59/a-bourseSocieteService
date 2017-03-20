package org.opendevup.dao;

import org.opendevup.entities.Societe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SocieteRepository extends JpaRepository<Societe, Long>{

	@Query("select s from Societe s where s.nomSociete like :x")
	public Page<Societe> societeParMC(@Param("x") String mc,Pageable pageable);
	
}
