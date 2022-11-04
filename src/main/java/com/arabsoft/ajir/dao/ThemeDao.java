package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Theme;
import com.arabsoft.ajir.entities.ThemePK;

public interface ThemeDao extends JpaRepository<Theme,ThemePK>{
	
	@Query(value="select COD_THEME,LIB_THEME,COD_TYP,LOCALITE,LIB_THEME_A,ABRV_THEME,COD_TIT,"
			+ "COD_NIVEAU,ID_THEME,LOCALITE from THEME  where COD_TIT=:codTit and COD_TYP=:codTyp",nativeQuery = true)
	public List<Theme> getThemeFormation(@Param("codTit") String codTit, @Param("codTyp") String codTyp);

}
