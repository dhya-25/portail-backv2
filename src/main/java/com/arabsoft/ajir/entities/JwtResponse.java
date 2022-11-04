package com.arabsoft.ajir.entities;

import java.util.Date;


public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long use_id;

	private String usematricule;

	private String uselogin;	

	private String use_pswd;

	private String use_lname;
	private String use_fname;
	private Long use_nbessai;
	private String use_cptestatus;
	private Date use_crtdt;
	private Date use_lastcnx;
	private String use_nivadm;
	private String use_type;
	private String use_status;
	private Date use_credt;
	private Date use_updtdt;
	private String use_updtby;
	private String cod_soc;
	private String matpers;
	private String cod_site;
	public JwtResponse(String token, String type, Long use_id, String usematricule, String uselogin, String usepsw,
			String use_lname, String use_fname, Long use_nbessai, String use_cptestatus, Date use_crtdt,
			Date use_lastcnx, String use_nivadm, String use_type, String use_status, Date use_credt, Date use_updtdt,
			String use_updtby, String cod_soc, String matpers, String cod_site) {
		super();
		this.token = token;
		this.type = type;
		this.use_id = use_id;
		this.usematricule = usematricule;
		this.uselogin = uselogin;
		this.use_pswd = usepsw;
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
	}
	public JwtResponse(String token, String type, String usematricule, String uselogin, String usepsw, String use_lname,
			String use_fname, Long use_nbessai, String use_cptestatus, Date use_crtdt, Date use_lastcnx,
			String use_nivadm, String use_type, String use_status, Date use_credt, Date use_updtdt, String use_updtby,
			String cod_soc, String matpers, String cod_site) {
		super();
		this.token = token;
		this.type = type;
		this.usematricule = usematricule;
		this.uselogin = uselogin;
		this.use_pswd = usepsw;
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
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getUse_id() {
		return use_id;
	}
	public void setUse_id(Long use_id) {
		this.use_id = use_id;
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
		return use_pswd;
	}
	public void setUsepsw(String usepsw) {
		this.use_pswd = usepsw;
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
	public String getMatpers() {
		return matpers;
	}
	public void setMatpers(String matpers) {
		this.matpers = matpers;
	}
	public String getCod_site() {
		return cod_site;
	}
	public void setCod_site(String cod_site) {
		this.cod_site = cod_site;
	}

	

}
