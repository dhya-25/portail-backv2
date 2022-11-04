package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="THEME")
public class Theme {
	@EmbeddedId
	private ThemePK id;
	@Column(name="COD_TIT",insertable = false,updatable = false)
	private String codTit;	
	@Column(name="COD_TYP",insertable = false,updatable = false)
	private String cod_typ;
	@Column(name="COD_THEME",insertable = false,updatable = false)
	private String codTheme;
	@Column(name="LIB_THEME")
	private String libTheme;
	@Column(name="LIB_THEME_A")
	private String libThemeA;
	@Column(name="LOCALITE")
	private String localite;
	@Column(name="ABRV_THEME")
	private String abrv_theme;
	
	@Column(name="COD_NIVEAU")
	private String codNiveau;
	@Column(name="ID_THEME")
	private String idTheme;
	public ThemePK getId() {
		return id;
	}
	public void setId(ThemePK id) {
		this.id = id;
	}
	public String getCodTit() {
		return codTit;
	}
	public void setCodTit(String codTit) {
		this.codTit = codTit;
	}
	public String getCod_typ() {
		return cod_typ;
	}
	public void setCod_typ(String cod_typ) {
		this.cod_typ = cod_typ;
	}
	public String getCodTheme() {
		return codTheme;
	}
	public void setCodTheme(String codTheme) {
		this.codTheme = codTheme;
	}
	public String getLibTheme() {
		return libTheme;
	}
	public void setLibTheme(String libTheme) {
		this.libTheme = libTheme;
	}
	public String getLibThemeA() {
		return libThemeA;
	}
	public void setLibThemeA(String libThemeA) {
		this.libThemeA = libThemeA;
	}
	public String getLocalite() {
		return localite;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	public String getAbrv_theme() {
		return abrv_theme;
	}
	public void setAbrv_theme(String abrv_theme) {
		this.abrv_theme = abrv_theme;
	}
	public String getCodNiveau() {
		return codNiveau;
	}
	public void setCodNiveau(String codNiveau) {
		this.codNiveau = codNiveau;
	}
	public String getIdTheme() {
		return idTheme;
	}
	public void setIdTheme(String idTheme) {
		this.idTheme = idTheme;
	}
	public Theme() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
