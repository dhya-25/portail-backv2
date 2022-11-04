package com.arabsoft.ajir.sevices;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.arabsoft.ajir.entities.AdmUser;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class UserDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L;

	private Long use_id;

	private String use_matricule;

	private String uselogin;	
@JsonIgnore
	private String use_psw;

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
	private String mat_pers;
	private String cod_site;
	private String use_pswd;
	


	

	public UserDetailsImpl(Long use_id, String use_matricule, String uselogin, String use_psw, String use_lname,
			String use_fname, Long use_nbessai, String use_cptestatus, Date use_crtdt, Date use_lastcnx,
			String use_nivadm, String use_type, String use_status, Date use_credt, Date use_updtdt, String use_updtby,
			String cod_soc, String mat_pers, String cod_site, String use_pswd) {
		super();
		this.use_id = use_id;
		this.use_matricule = use_matricule;
		this.uselogin = uselogin;
		this.use_psw = use_psw;
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
		this.mat_pers = mat_pers;
		this.cod_site = cod_site;
		this.use_pswd = use_pswd;
	}

	public UserDetailsImpl() {
		super();
	}

	

	public static UserDetailsImpl build(AdmUser user) {
	

		return new UserDetailsImpl(user.getUse_id(), user.getUsematricule(), user.getUselogin(), user.getUsepsw(), user.getUse_lname(),
				user.getUse_fname(), user.getUse_nbessai(), user.getUse_cptestatus(),user.getUse_crtdt(), user.getUse_lastcnx(),
				user.getUse_nivadm(), user.getUse_type(), user.getUse_status(),user.getUse_credt(), user.getUse_updtdt(), user.getUse_updtby(),
				user.getCod_soc(), user.getMatpers(), user.getCod_site(), user.getUsepswd());
	}

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getUse_id() {
		return use_id;
	}

	public void setUse_id(Long use_id) {
		this.use_id = use_id;
	}

	public String getUse_matricule() {
		return use_matricule;
	}

	public void setUse_matricule(String use_matricule) {
		this.use_matricule = use_matricule;
	}

	public String getUselogin() {
		return uselogin;
	}

	public void setUselogin(String uselogin) {
		this.uselogin = uselogin;
	}

	public String getUse_psw() {
		return use_psw;
	}

	public void setUse_psw(String use_psw) {
		this.use_psw = use_psw;
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
		return mat_pers;
	}

	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}

	public String getCod_site() {
		return cod_site;
	}

	public void setCod_site(String cod_site) {
		this.cod_site = cod_site;
	}

	public String getUse_pswd() {
		return use_pswd;
	}

	public void setUse_pswd(String use_pswd) {
		this.use_pswd = use_pswd;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod_site, cod_soc, mat_pers, use_cptestatus, use_credt, use_crtdt, use_fname, use_id,
				use_lastcnx, use_lname, use_matricule, use_nbessai, use_nivadm, use_psw, use_pswd, use_status, use_type,
				use_updtby, use_updtdt, uselogin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetailsImpl other = (UserDetailsImpl) obj;
		return Objects.equals(cod_site, other.cod_site) && Objects.equals(cod_soc, other.cod_soc)
				&& Objects.equals(mat_pers, other.mat_pers) && Objects.equals(use_cptestatus, other.use_cptestatus)
				&& Objects.equals(use_credt, other.use_credt) && Objects.equals(use_crtdt, other.use_crtdt)
				&& Objects.equals(use_fname, other.use_fname) && Objects.equals(use_id, other.use_id)
				&& Objects.equals(use_lastcnx, other.use_lastcnx) && Objects.equals(use_lname, other.use_lname)
				&& Objects.equals(use_matricule, other.use_matricule) && Objects.equals(use_nbessai, other.use_nbessai)
				&& Objects.equals(use_nivadm, other.use_nivadm) && Objects.equals(use_psw, other.use_psw)
				&& Objects.equals(use_pswd, other.use_pswd) && Objects.equals(use_status, other.use_status)
				&& Objects.equals(use_type, other.use_type) && Objects.equals(use_updtby, other.use_updtby)
				&& Objects.equals(use_updtdt, other.use_updtdt) && Objects.equals(uselogin, other.uselogin);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return use_pswd;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return mat_pers;
	}

	
}
