package com.arabsoft.ajir.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.AdrPers;
import com.arabsoft.ajir.entities.CleAdrPers;

 

@Repository
public interface AdrPersRep extends JpaRepository<AdrPers, CleAdrPers>{
	
	  Boolean existsByAdrelectronique(String email);
	  Optional <AdrPers> findByAdrelectronique(String email);
	  @Query("select a from AdrPers a where a.adr_courant='O' and a.adrelectronique=:adrelectronique")
	   AdrPers findByAdrelectroniqueo(@Param("adrelectronique") String adrelectronique);
	  @Query("select a from AdrPers a where a.adr_courant='O' and a.adrelectronique=:adrelectronique")
	  Optional<AdrPers> findByAdrelectroniqueoo(@Param("adrelectronique") String adrelectronique);



}
