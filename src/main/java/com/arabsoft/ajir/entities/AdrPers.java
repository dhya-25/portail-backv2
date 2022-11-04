package com.arabsoft.ajir.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ADR_PERS")
public class AdrPers implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	
	private CleAdrPers id;
	@Column(name = "COD_GOUV")
	private String cod_gouv;
	@Column(name = "COD_DELEG")
	private String cod_deleg;
	@Column(name = "COD_POST")
	private String cod_post;

 
 
	@Column(name = "RUE")
	private String rue;
	@Column(name = "RUE_A")
	private String rue_a;
	@Column(name = "TEL_PERS")
	private String tel_pers;
	@Column(name = "FAX_PERS")
	private String fax_pers;
	@Column(name = "ADR_COURANT")
	private String adr_courant;
	@Column(name = "ADR_ELECTRONIQUE")
	private String adrelectronique;
	@Column(name = "TEL_PORT_PERS")
	private String tel_port_pers;
	@Column(name = "NUMERO_ADR")
	private Long numero_adr;
	@Column(name = "ETAT_ADR")
	private String etat_adr;
	@Column(name = "IMMB_PERS")
	private String immb_pers;
	@Column(name = "APP_PERS")
	private String app_pers;
	@Column(name = "LOCAL_PERS")
	private String local_pers;

	@Column(name = "REC_MAIL")
	private String rec_mail;
	@Column(name = "COD_USER")
	private String cod_user;
	public AdrPers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public AdrPers(CleAdrPers id, String cod_gouv, String cod_deleg, String cod_post, String rue, String rue_a,
			String tel_pers, String fax_pers, String adr_courant, String adrelectronique, String tel_port_pers,
			Long numero_adr, String etat_adr, String immb_pers, String app_pers, String local_pers, String codeSoc,
			String rec_mail, String cod_user) {
		super();
		this.id = id;
		this.cod_gouv = cod_gouv;
		this.cod_deleg = cod_deleg;
		this.cod_post = cod_post;
		this.rue = rue;
		this.rue_a = rue_a;
		this.tel_pers = tel_pers;
		this.fax_pers = fax_pers;
		this.adr_courant = adr_courant;
		this.adrelectronique = adrelectronique;
		this.tel_port_pers = tel_port_pers;
		this.numero_adr = numero_adr;
		this.etat_adr = etat_adr;
		this.immb_pers = immb_pers;
		this.app_pers = app_pers;
		this.local_pers = local_pers;
		this.rec_mail = rec_mail;
		this.cod_user = cod_user;
	}




	public CleAdrPers getId() {
		return id;
	}
	public void setId(CleAdrPers id) {
		this.id = id;
	}
	public String getCod_gouv() {
		return cod_gouv;
	}
	public void setCod_gouv(String cod_gouv) {
		this.cod_gouv = cod_gouv;
	}
	public String getCod_deleg() {
		return cod_deleg;
	}
	public void setCod_deleg(String cod_deleg) {
		this.cod_deleg = cod_deleg;
	}
	public String getCod_post() {
		return cod_post;
	}
	public void setCod_post(String cod_post) {
		this.cod_post = cod_post;
	}

	
	
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getRue_a() {
		return rue_a;
	}
	public void setRue_a(String rue_a) {
		this.rue_a = rue_a;
	}
	public String getTel_pers() {
		return tel_pers;
	}
	public void setTel_pers(String tel_pers) {
		this.tel_pers = tel_pers;
	}
	public String getFax_pers() {
		return fax_pers;
	}
	public void setFax_pers(String fax_pers) {
		this.fax_pers = fax_pers;
	}
	public String getAdr_courant() {
		return adr_courant;
	}
	public void setAdr_courant(String adr_courant) {
		this.adr_courant = adr_courant;
	}
	public String getAdr_electronique() {
		return adrelectronique;
	}
	public void setAdr_electronique(String adr_electronique) {
		this.adrelectronique = adr_electronique;
	}
	public String getTel_port_pers() {
		return tel_port_pers;
	}
	public void setTel_port_pers(String tel_port_pers) {
		this.tel_port_pers = tel_port_pers;
	}
	public Long getNumero_adr() {
		return numero_adr;
	}
	public void setNumero_adr(Long numero_adr) {
		this.numero_adr = numero_adr;
	}
	public String getEtat_adr() {
		return etat_adr;
	}
	public void setEtat_adr(String etat_adr) {
		this.etat_adr = etat_adr;
	}
	public String getImmb_pers() {
		return immb_pers;
	}
	public void setImmb_pers(String immb_pers) {
		this.immb_pers = immb_pers;
	}
	public String getApp_pers() {
		return app_pers;
	}
	public void setApp_pers(String app_pers) {
		this.app_pers = app_pers;
	}
	public String getLocal_pers() {
		return local_pers;
	}
	public void setLocal_pers(String local_pers) {
		this.local_pers = local_pers;
	}
	 
	public String getRec_mail() {
		return rec_mail;
	}
	public void setRec_mail(String rec_mail) {
		this.rec_mail = rec_mail;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}




	public String getAdrelectronique() {
		return adrelectronique;
	}




	public void setAdrelectronique(String adrelectronique) {
		this.adrelectronique = adrelectronique;
	}




	

	
	
}
