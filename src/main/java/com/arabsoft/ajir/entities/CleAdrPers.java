package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CleAdrPers implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(insertable = false,updatable = false)
	private String cod_soc;
	@Column(insertable = false,updatable = false)
	private String mat_pers;
	@Column(insertable = false,updatable = false)
	private Long num_adr;
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getMat_pers() {
		return mat_pers;
	}
	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}
	public Long getNum_adr() {
		return num_adr;
	}
	public void setNum_adr(Long num_adr) {
		this.num_adr = num_adr;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cod_soc, mat_pers, num_adr);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CleAdrPers other = (CleAdrPers) obj;
		return Objects.equals(cod_soc, other.cod_soc) && Objects.equals(mat_pers, other.mat_pers)
				&& Objects.equals(num_adr, other.num_adr);
	}
	public CleAdrPers(String cod_soc, String mat_pers, Long num_adr) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_adr = num_adr;
	}
	public CleAdrPers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
