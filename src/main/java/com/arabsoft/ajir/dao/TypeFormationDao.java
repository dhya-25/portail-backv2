package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.TypeFormation;
import com.arabsoft.ajir.entities.TypeFormationPK;

public interface TypeFormationDao extends JpaRepository<TypeFormation, TypeFormationPK> {
	@Query(value="select COD_TYP,LIB_TYP,COD_RUB_BUDG,LIB_TYP_A,ABRV_TYP_FORM,COD_TIT,"
			+ "COD_NAT,TYP_STAGE,ID_TYPE_FORMATION from TYPE_FORMATION where COD_TIT=:codTit",nativeQuery = true)
	public List<TypeFormation> getTypeFormation(@Param("codTit") String codTit);
}
