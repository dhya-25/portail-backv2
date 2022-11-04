package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

public class ThemePK  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(insertable = false,updatable = false)
	private String cod_tit;
	@Column(insertable = false,updatable = false)
	private String  cod_typ;
	@Column(insertable = false,updatable = false)
	private String  cod_theme;
	public String getCod_tit() {
		return cod_tit;
	}
	public void setCod_tit(String cod_tit) {
		this.cod_tit = cod_tit;
	}
	public String getCod_typ() {
		return cod_typ;
	}
	public void setCod_typ(String cod_typ) {
		this.cod_typ = cod_typ;
	}
	public String getCod_theme() {
		return cod_theme;
	}
	public void setCod_theme(String cod_theme) {
		this.cod_theme = cod_theme;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cod_theme, cod_tit, cod_typ);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ThemePK other = (ThemePK) obj;
		return Objects.equals(cod_theme, other.cod_theme) && Objects.equals(cod_tit, other.cod_tit)
				&& Objects.equals(cod_typ, other.cod_typ);
	}
	public ThemePK(String cod_tit, String cod_typ, String cod_theme) {
		super();
		this.cod_tit = cod_tit;
		this.cod_typ = cod_typ;
		this.cod_theme = cod_theme;
	}
	public ThemePK() {
		super();
		// TODO Auto-generated constructor stub
	}


}
