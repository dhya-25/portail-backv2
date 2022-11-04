package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADMUSER")
public class AdmUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUser")
	@SequenceGenerator(name = "seqUser", sequenceName = "SEQ_ADMUSER", allocationSize = 1)
	@Column(name = "USE_ID")
	private Long use_id;
	@Column(name = "USE_MATRICULE")

	private String usematricule;
	@Column(name = "USE_LOGIN")

	private String uselogin;	
	@Column(name = "USE_PSW")

	private String usepsw;
	@Column(name = "USE_LNAME")

	private String use_lname;
	@Column(name = "USE_FNAME")
	private String use_fname;
	@Column(name = "USE_NBESSAI")
	private Long use_nbessai;
	@Column(name = "USE_CPTESTATUS")
	private String use_cptestatus;
	@Column(name = "USE_CRTDT")
	private Date use_crtdt;
	@Column(name = "USE_LASTCNX")
	private Date use_lastcnx;
	@Column(name = "USE_NIVADM")
	private String use_nivadm;
	@Column(name = "USE_TYPE")
	private String use_type;
	@Column(name = "USE_STATUS")
	private String use_status;
	@Column(name = "USE_CREDT")
	private Date use_credt;
	@Column(name = "USE_UPDTDT")
	private Date use_updtdt;
	@Column(name = "USE_UPDTBY")
	private String use_updtby;
	@Column(name = "COD_SOC")
	private String cod_soc;
	@Column(name = "MAT_PERS")
	private String matpers;
	@Column(name = "COD_SITE")
	private String cod_site;
	@Column(name = "USE_PSWD")

	private String usepswd;
	
	

	public String getUsepswd() {
		return usepswd;
	}

	public void setUsepswd(String usepswd) {
		this.usepswd = usepswd;
	}

	public String getUsematricule() {
		return usematricule;
	}

	public void setUsematricule(String usematricule) {
		this.usematricule = usematricule;
	}

	public String getUselogin() {
		return uselogin;
	}

	public void setUselogin(String uselogin) {
		this.uselogin = uselogin;
	}

	public String getUsepsw() {
		return usepsw;
	}

	public void setUsepsw(String usepsw) {
		this.usepsw = usepsw;
	}

	public String getMatpers() {
		return matpers;
	}

	public void setMatpers(String matpers) {
		this.matpers = matpers;
	}

	

	public AdmUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AdmUser(Long use_id, String usematricule, String uselogin, String usepsw, String use_lname, String use_fname,
			Long use_nbessai, String use_cptestatus, Date use_crtdt, Date use_lastcnx, String use_nivadm,
			String use_type, String use_status, Date use_credt, Date use_updtdt, String use_updtby, String cod_soc,
			String matpers, String cod_site, String usepswd) {
		super();
		this.use_id = use_id;
		this.usematricule = usematricule;
		this.uselogin = uselogin;
		this.usepsw = usepsw;
		this.use_lname = use_lname;
		this.use_fname = use_fname;
		this.use_nbessai = use_nbessai;
		this.use_cptestatus = use_cptestatus;
		this.use_crtdt = use_crtdt;
		this.use_lastcnx = use_lastcnx;
		this.use_nivadm = use_nivadm;
		this.use_type = use_type;
		this.use_status = use_status;
		this.use_credt = use_credt;
		this.use_updtdt = use_updtdt;
		this.use_updtby = use_updtby;
		this.cod_soc = cod_soc;
		this.matpers = matpers;
		this.cod_site = cod_site;
		this.usepswd = usepswd;
	}

	public Long getUse_id() {
		return use_id;
	}
	public void setUse_id(Long use_id) {
		this.use_id = use_id;
	}
	public String getUse_matricule() {
		return usematricule;
	}
	public void setUse_matricule(String use_matricule) {
		this.usematricule = use_matricule;
	}
	public String getUse_login() {
		return uselogin;
	}
	public void setUse_login(String use_login) {
		this.uselogin = use_login;
	}
	public String getUse_psw() {
		return usepsw;
	}
	public void setUse_psw(String use_psw) {
		this.usepsw = use_psw;
	}
	public String getUse_lname() {
		return use_lname;
	}
	public void setUse_lname(String use_lname) {
		this.use_lname = use_lname;
	}
	public String getUse_fname() {
		return use_fname;
	}
	public void setUse_fname(String use_fname) {
		this.use_fname = use_fname;
	}
	public Long getUse_nbessai() {
		return use_nbessai;
	}
	public void setUse_nbessai(Long use_nbessai) {
		this.use_nbessai = use_nbessai;
	}
	public String getUse_cptestatus() {
		return use_cptestatus;
	}
	public void setUse_cptestatus(String use_cptestatus) {
		this.use_cptestatus = use_cptestatus;
	}
	public Date getUse_crtdt() {
		return use_crtdt;
	}
	public void setUse_crtdt(Date use_crtdt) {
		this.use_crtdt = use_crtdt;
	}
	public Date getUse_lastcnx() {
		return use_lastcnx;
	}
	public void setUse_lastcnx(Date use_lastcnx) {
		this.use_lastcnx = use_lastcnx;
	}
	public String getUse_nivadm() {
		return use_nivadm;
	}
	public void setUse_nivadm(String use_nivadm) {
		this.use_nivadm = use_nivadm;
	}
	public String getUse_type() {
		return use_type;
	}
	public void setUse_type(String use_type) {
		this.use_type = use_type;
	}
	public String getUse_status() {
		return use_status;
	}
	public void setUse_status(String use_status) {
		this.use_status = use_status;
	}
	public Date getUse_credt() {
		return use_credt;
	}
	public void setUse_credt(Date use_credt) {
		this.use_credt = use_credt;
	}
	public Date getUse_updtdt() {
		return use_updtdt;
	}
	public void setUse_updtdt(Date use_updtdt) {
		this.use_updtdt = use_updtdt;
	}
	public String getUse_updtby() {
		return use_updtby;
	}
	public void setUse_updtby(String use_updtby) {
		this.use_updtby = use_updtby;
	}
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getMat_pers() {
		return matpers;
	}
	public void setMat_pers(String mat_pers) {
		this.matpers = mat_pers;
	}
	public String getCod_site() {
		return cod_site;
	}
	public void setCod_site(String cod_site) {
		this.cod_site = cod_site;
	}
	@Override
	public String toString() {
		return "AdmUser [use_id=" + use_id + ", use_matricule=" + usematricule + ", use_login=" + uselogin
				+ ", use_psw=" + usepsw + ", use_lname=" + use_lname + ", use_fname=" + use_fname + ", use_nbessai="
				+ use_nbessai + ", use_cptestatus=" + use_cptestatus + ", use_crtdt=" + use_crtdt + ", use_lastcnx="
				+ use_lastcnx + ", use_nivadm=" + use_nivadm + ", use_type=" + use_type + ", use_status=" + use_status
				+ ", use_credt=" + use_credt + ", use_updtdt=" + use_updtdt + ", use_updtby=" + use_updtby
				+ ", cod_soc=" + cod_soc + ", mat_pers=" + matpers + ", cod_site=" + cod_site + "]";
	}

	
	

}
