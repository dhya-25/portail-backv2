package com.arabsoft.ajir.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.controller.LibreDemandeController;
import com.arabsoft.ajir.entities.Libre_demande;
import com.arabsoft.ajir.entities.TitreFormation;

public interface DemandeDao extends JpaRepository<Libre_demande, Long> {
	
	@Query(value = "select \r\n"
			+ "       ID_LIBRE_DEMANDE\r\n"
			+ "       COD_SOC,  \r\n"
			+ "       MAT_PERS,\r\n"
			+ "       TYP_DEMANDE,\r\n"
			+ "       DATE_DEMANDE,\r\n"
			+ "       DAT_DEBUT,\r\n"
			+ "       DAT_FIN,\r\n"
			+ "       HEUR_S,\r\n"
			+ "       MIN_S,\r\n"
			+ "       HEUR_R,\r\n"
			+ "       MIN_R,\r\n"
			+ "       COD_TIT,\r\n"
			+ "       COD_TYP,\r\n"
			+ "       COD_THEME,\r\n"
			+ "       COD_GRP_PRET,\r\n"
			+ "       TYP_PRET,\r\n"
			+ "       MNT_DEM,\r\n"
			+ "       NUM_ATTEST,\r\n"
			+ "       TXT_DEM,\r\n"
			+ "       TXT_REPONSE,\r\n"
			+ "       REPONSE_CHEF,\r\n"
			+ "       REPONSE,\r\n"
			+ "       TXT_CHEF,\r\n"
			+ "       FILE_NAME,\r\n"
			+ "       CONTENT_TYPE,\r\n"
			+ "       PATH,\r\n"
			+ "       FICHIER_JOINT ,\r\n"
			+ "       COD_M,\r\n"
			+ "       CNG_TEMPS_FIN,\r\n"
			+ "       CNG_TEMPS_DEBUT,\r\n"
			+ "       CNG_TEMPS,\r\n"
			+ "       COD_AUT,\r\n"
			+ "       ANNEE\r\n"
			+ "from libre_demande\r\n"
			+ "where COD_SOC=:codSoc\r\n" , nativeQuery = true)
	public List<Libre_demande> getListDemande(@Param("codSoc") String codSoc);
	
	
	
	@Query(value="select ID_LIBRE_DEMANDE,COD_SOC,MAT_PERS,TYP_DEMANDE,DATE_DEMANDE,"
			+ "DAT_DEBUT,DAT_FIN,HEUR_S,MIN_S,HEUR_R,MIN_R,COD_TIT,COD_TYP,COD_THEME,COD_GRP_PRET,TYP_PRET,MNT_DEM"
			+ ",NUM_ATTEST,TXT_DEM,TXT_REPONSE,REPONSE_CHEF, REPONSE, TXT_CHEF,FILE_NAME,CONTENT_TYPE"
			+ ",PATH,FICHIER_JOINT,COD_M,CNG_TEMPS_FIN,CNG_TEMPS_DEBUT,CNG_TEMPS,COD_AUT"
			+ ",ANNEE from libre_demande where COD_SOC=:codSoc and MAT_PERS=:matpers and TYP_DEMANDE=:type",nativeQuery = true)
	public List<Libre_demande> get(@Param("codSoc")String codSoc,@Param("matpers") String matpers,@Param("type") String type);

	
}





