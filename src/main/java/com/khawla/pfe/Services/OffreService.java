package com.khawla.pfe.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.khawla.pfe.Repositories.OffreRepo;
import com.khawla.pfe.entities.Offre;


@Service
public class OffreService {
	
	@Autowired
    OffreRepo offreRepo;


	
	
    public Offre addOffre(Offre offre) {
        return offreRepo.save(offre);
    }

    
    public void deleteOffre(Long idOffre) {
        offreRepo.deleteById(idOffre);
        System.out.println("Offre supprimé");
    }

    
    public Offre FindOffre(Long idOffre) {
    	Offre a = offreRepo.findById(idOffre).orElse(null);
		System.out.println(a);
		return (a);
	}
    
    public void UpdateOffre(Offre offre) {
    	offreRepo.saveAndFlush(offre);
	}
    

}
