package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TYPE_FORMATION")

public class TypeFormation {
	@EmbeddedId
	public TypeFormationPK id;
	@Column(name="COD_TYP",insertable = false,updatable = false)
	public String cod_typ  ;    
	@Column(name="LIB_TYP")
	public String  lib_typ   ;      
	@Column(name="COD_RUB_BUDG")
	public String cod_rub_budg  ;  
	@Column(name="LIB_TYP_A")
	public String  lib_typ_a     ;   
	@Column(name="ABRV_TYP_FORM")
	public String  abrv_typ_form   ;  
	@Column(name="COD_TIT",insertable = false,updatable = false)
	public String  cod_tit      ;    
	@Column(name="COD_NAT")
	public String  cod_nat     ;      
	@Column(name="TYP_STAGE")
	public String  typ_stage  ;
	@Column(name="ID_TYPE_FORMATION")
	public String  id_type_formation  ;
	
}
	 
