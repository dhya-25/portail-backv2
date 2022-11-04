package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.TitreFormation;


public interface TitreFormationDao extends JpaRepository<TitreFormation, String> {
	@Query(value="select t.COD_TIT,t.LIB_TIT,t.LIB_TIT_A,t.NATURE_FORM,t.TYP_TIT,t.ABRV_TIT from TITRE_FORMATION t ",nativeQuery = true)
	public List<TitreFormation> getTitreFormation( );
}
