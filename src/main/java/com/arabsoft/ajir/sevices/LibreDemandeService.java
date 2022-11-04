package com.arabsoft.ajir.sevices;


import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import com.arabsoft.ajir.controller.ResponseMessage;
import com.arabsoft.ajir.dao.DemandeDao;
import com.arabsoft.ajir.entities.Libre_demande;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class LibreDemandeService {

	@Autowired
	DemandeDao demandeDAO;

	@Transactional
	public ResponseMessage createDem(MultipartFile file, String dem) throws IOException {
		ResponseMessage responseMessage = new ResponseMessage();
		Libre_demande arti = new ObjectMapper().readValue(dem, Libre_demande.class);
		arti.setFichierJoint(file.getBytes());
		arti.setFileName(file.getOriginalFilename());
		arti.setContentType(file.getContentType());
		arti.setPath("DB");
		try {
			demandeDAO.save(arti);
			responseMessage.setCode("0");
			responseMessage.setMessage("Demande created");
		} catch (Exception e) {
			responseMessage.setCode("1");
			responseMessage.setMessage("Demande Not created");
		}
		return responseMessage;
	}
	
	 /* public Stream<Libre_demande> getAllFiles(String cocdeSoc,String matPers) {
		    return demandeDAO.get(cocdeSoc,matPers).stream();
		  }
		public Libre_demande getFile(String fileId) {

			return demandeDAO.findByCodsoc(fileId);
					
		}*/
}
	/*@Transactional
	public Libre_demande getListDemande(Libre_demande dem) {
		  
		String codSoc = dem.getCod_soc();
		String typDem = dem.getTyp_demande();
		Date dateDebut = dem.getDat_debut();
		Date dateFin = dem.getDat_fin();
		String matPers = dem.getMat_pers();
		Libre_demande d = this.demandeDAO.getListDemande(codSoc, typDem, dateDebut,dateFin, matPers);
		 

		return d;
	}*/


