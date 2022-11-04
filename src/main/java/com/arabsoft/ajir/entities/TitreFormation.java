package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TITRE_FORMATION")
public class TitreFormation {
	@Id
	@Column(name="COD_TIT")
	public String cod_tit;
	@Column(name="LIB_TIT")
	public String lib_tit;	
	@Column(name="LIB_TIT_A")
	public String lib_tit_a;	
	@Column(name="NATURE_FORM")
	public String nature_form;	
	@Column(name="TYP_TIT")
	public String typ_tit;	
	@Column(name="ABRV_TIT")
	public String abrv_tit;
	public String getCod_tit() {
		return cod_tit;
	}
	public void setCod_tit(String cod_tit) {
		this.cod_tit = cod_tit;
	}
	public String getLib_tit() {
		return lib_tit;
	}
	public void setLib_tit(String lib_tit) {
		this.lib_tit = lib_tit;
	}
	public String getLib_tit_a() {
		return lib_tit_a;
	}
	public void setLib_tit_a(String lib_tit_a) {
		this.lib_tit_a = lib_tit_a;
	}
	public String getNature_form() {
		return nature_form;
	}
	public void setNature_form(String nature_form) {
		this.nature_form = nature_form;
	}
	public String getTyp_tit() {
		return typ_tit;
	}
	public void setTyp_tit(String typ_tit) {
		this.typ_tit = typ_tit;
	}
	public String getAbrv_tit() {
		return abrv_tit;
	}
	public void setAbrv_tit(String abrv_tit) {
		this.abrv_tit = abrv_tit;
	}
	public TitreFormation(String cod_tit, String lib_tit, String lib_tit_a, String nature_form, String typ_tit,
			String abrv_tit) {
		super();
		this.cod_tit = cod_tit;
		this.lib_tit = lib_tit;
		this.lib_tit_a = lib_tit_a;
		this.nature_form = nature_form;
		this.typ_tit = typ_tit;
		this.abrv_tit = abrv_tit;
	}
	public TitreFormation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TitreFormation [cod_tit=" + cod_tit + ", lib_tit=" + lib_tit + ", lib_tit_a=" + lib_tit_a
				+ ", nature_form=" + nature_form + ", typ_tit=" + typ_tit + ", abrv_tit=" + abrv_tit + "]";
	}

}
