package com.arabsoft.ajir.entities;


import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "LIBRE_DEMANDE")
public class Libre_demande {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqLibre")
    @SequenceGenerator(name = "seqLibre", sequenceName = "SEQ_LIBRE_DEMANDE", allocationSize = 1)
	@Column(name="ID_LIBRE_DEMANDE")
	private long id_libre_demande;
	@Column(name="COD_SOC")
	private String codSoc;
	@Column(name="MAT_PERS")
	private String matPers;
	@Column(name="TYP_DEMANDE")
	private String typDemande;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DATE_DEMANDE")
	private Date dateDemande;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Nullable
	@Column(name="DAT_DEBUT")
	//@Temporal(TemporalType.DATE)
	private Date datDebut;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DAT_FIN")
	//@Temporal(TemporalType.DATE)
	private Date datFin;
	@Column(name="HEUR_S")
	private Long heurS;
	@Column(name="MIN_S")
	private Long minS;
	@Column(name="HEUR_R")
	private Long heurR;
	@Column(name="MIN_R")
	private Long minR;
	@Column(name="COD_TIT")
	private String codTit;
	@Column(name="COD_TYP")
	private String codTyp;
	@Column(name="COD_THEME")
	private String codTheme;
	@Column(name="COD_GRP_PRET")
	private String codGrpPret;
	@Column(name="TYP_PRET")
	private String typPret;
	@Column(name="MNT_DEM")
	private Long mntDem;
	@Column(name="NUM_ATTEST")
	private Long numAttest;
	@Column(name="TXT_DEM")
	private String txtDem;
	@Column(name="TXT_REPONSE")
	private String txtReponse;
	@Column(name="REPONSE_CHEF")
	private String reponseChef;
	@Column(name="REPONSE")
	private String reponse;
	@Column(name="TXT_CHEF")
	private String txtChef;
	@Column(name="FILE_NAME")
	private String fileName;
	@Column(name="CONTENT_TYPE")
	private String contentType;
	@Column(name="PATH")
	private String path;
	@Lob
	@Column(name="FICHIER_JOINT",columnDefinition="BLOB")
	private byte[] fichierJoint;
	@Column(name="COD_M")
	private String codM;
	@Column(name="CNG_TEMPS_FIN")
	private String cngTempsFin;
	@Column(name="CNG_TEMPS_DEBUT")
	private String cngTempsDebut;
	@Column(name="CNG_TEMPS")
	private String cngTemps;
	@Column(name="COD_AUT")
	private String codAut;
	@Column(name="ANNEE")
	private Long annee;
	public Libre_demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libre_demande(long id_libre_demande, String codSoc, String matPers, String typDemande, Date dateDemande,
			Date datDebut, Date datFin, Long heurS, Long minS, Long heurR, Long minR, String codTit, String codTyp,
			String codTheme, String codGrpPret, String typPret, Long mntDem, Long numAttest, String txtDem,
			String txtReponse, String reponseChef, String reponse, String txtChef, String fileName, String contentType,
			String path, byte[] fichierJoint, String codM, String cngTempsFin, String cngTempsDebut, String cngTemps,
			String codAut, Long annee) {
		super();
		this.id_libre_demande = id_libre_demande;
		this.codSoc = codSoc;
		this.matPers = matPers;
		this.typDemande = typDemande;
		this.dateDemande = dateDemande;
		this.datDebut = datDebut;
		this.datFin = datFin;
		this.heurS = heurS;
		this.minS = minS;
		this.heurR = heurR;
		this.minR = minR;
		this.codTit = codTit;
		this.codTyp = codTyp;
		this.codTheme = codTheme;
		this.codGrpPret = codGrpPret;
		this.typPret = typPret;
		this.mntDem = mntDem;
		this.numAttest = numAttest;
		this.txtDem = txtDem;
		this.txtReponse = txtReponse;
		this.reponseChef = reponseChef;
		this.reponse = reponse;
		this.txtChef = txtChef;
		this.fileName = fileName;
		this.contentType = contentType;
		this.path = path;
		this.fichierJoint = fichierJoint;
		this.codM = codM;
		this.cngTempsFin = cngTempsFin;
		this.cngTempsDebut = cngTempsDebut;
		this.cngTemps = cngTemps;
		this.codAut = codAut;
		this.annee = annee;
	}
	public long getId_libre_demande() {
		return id_libre_demande;
	}
	public void setId_libre_demande(long id_libre_demande) {
		this.id_libre_demande = id_libre_demande;
	}
	public String getCodSoc() {
		return codSoc;
	}
	public void setCodSoc(String codSoc) {
		this.codSoc = codSoc;
	}
	public String getMatPers() {
		return matPers;
	}
	public void setMatPers(String matPers) {
		this.matPers = matPers;
	}
	public String getTypDemande() {
		return typDemande;
	}
	public void setTypDemande(String typDemande) {
		this.typDemande = typDemande;
	}
	public Date getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}
	public Date getDatDebut() {
		return datDebut;
	}
	public void setDatDebut(Date datDebut) {
		this.datDebut = datDebut;
	}
	public Date getDatFin() {
		return datFin;
	}
	public void setDatFin(Date datFin) {
		this.datFin = datFin;
	}
	public Long getHeurS() {
		return heurS;
	}
	public void setHeurS(Long heurS) {
		this.heurS = heurS;
	}
	public Long getMinS() {
		return minS;
	}
	public void setMinS(Long minS) {
		this.minS = minS;
	}
	public Long getHeurR() {
		return heurR;
	}
	public void setHeurR(Long heurR) {
		this.heurR = heurR;
	}
	public Long getMinR() {
		return minR;
	}
	public void setMinR(Long minR) {
		this.minR = minR;
	}
	public String getCodTit() {
		return codTit;
	}
	public void setCodTit(String codTit) {
		this.codTit = codTit;
	}
	public String getCodTyp() {
		return codTyp;
	}
	public void setCodTyp(String codTyp) {
		this.codTyp = codTyp;
	}
	public String getCodTheme() {
		return codTheme;
	}
	public void setCodTheme(String codTheme) {
		this.codTheme = codTheme;
	}
	public String getCodGrpPret() {
		return codGrpPret;
	}
	public void setCodGrpPret(String codGrpPret) {
		this.codGrpPret = codGrpPret;
	}
	public String getTypPret() {
		return typPret;
	}
	public void setTypPret(String typPret) {
		this.typPret = typPret;
	}
	public Long getMntDem() {
		return mntDem;
	}
	public void setMntDem(Long mntDem) {
		this.mntDem = mntDem;
	}
	public Long getNumAttest() {
		return numAttest;
	}
	public void setNumAttest(Long numAttest) {
		this.numAttest = numAttest;
	}
	public String getTxtDem() {
		return txtDem;
	}
	public void setTxtDem(String txtDem) {
		this.txtDem = txtDem;
	}
	public String getTxtReponse() {
		return txtReponse;
	}
	public void setTxtReponse(String txtReponse) {
		this.txtReponse = txtReponse;
	}
	public String getReponseChef() {
		return reponseChef;
	}
	public void setReponseChef(String reponseChef) {
		this.reponseChef = reponseChef;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public String getTxtChef() {
		return txtChef;
	}
	public void setTxtChef(String txtChef) {
		this.txtChef = txtChef;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public byte[] getFichierJoint() {
		return fichierJoint;
	}
	public void setFichierJoint(byte[] fichierJoint) {
		this.fichierJoint = fichierJoint;
	}
	public String getCodM() {
		return codM;
	}
	public void setCodM(String codM) {
		this.codM = codM;
	}
	public String getCngTempsFin() {
		return cngTempsFin;
	}
	public void setCngTempsFin(String cngTempsFin) {
		this.cngTempsFin = cngTempsFin;
	}
	public String getCngTempsDebut() {
		return cngTempsDebut;
	}
	public void setCngTempsDebut(String cngTempsDebut) {
		this.cngTempsDebut = cngTempsDebut;
	}
	public String getCngTemps() {
		return cngTemps;
	}
	public void setCngTemps(String cngTemps) {
		this.cngTemps = cngTemps;
	}
	public String getCodAut() {
		return codAut;
	}
	public void setCodAut(String codAut) {
		this.codAut = codAut;
	}
	public Long getAnnee() {
		return annee;
	}
	public void setAnnee(Long annee) {
		this.annee = annee;
	}
	@Override
	public String toString() {
		return "Libre_demande [id_libre_demande=" + id_libre_demande + ", codSoc=" + codSoc + ", matPers=" + matPers
				+ ", typDemande=" + typDemande + ", dateDemande=" + dateDemande + ", datDebut=" + datDebut + ", datFin="
				+ datFin + ", heurS=" + heurS + ", minS=" + minS + ", heurR=" + heurR + ", minR=" + minR + ", codTit="
				+ codTit + ", codTyp=" + codTyp + ", codTheme=" + codTheme + ", codGrpPret=" + codGrpPret + ", typPret="
				+ typPret + ", mntDem=" + mntDem + ", numAttest=" + numAttest + ", txtDem=" + txtDem + ", txtReponse="
				+ txtReponse + ", reponseChef=" + reponseChef + ", reponse=" + reponse + ", txtChef=" + txtChef
				+ ", fileName=" + fileName + ", contentType=" + contentType + ", path=" + path + ", fichierJoint="
				+ Arrays.toString(fichierJoint) + ", codM=" + codM + ", cngTempsFin=" + cngTempsFin + ", cngTempsDebut="
				+ cngTempsDebut + ", cngTemps=" + cngTemps + ", codAut=" + codAut + ", annee=" + annee + "]";
	}
	
	
}
	
