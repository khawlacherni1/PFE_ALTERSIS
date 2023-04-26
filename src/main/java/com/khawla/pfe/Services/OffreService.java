package com.khawla.pfe.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.khawla.pfe.Repositories.OffreRepo;
import com.khawla.pfe.entities.Offer;


@Service
public class OffreService {
	
	@Autowired
    OffreRepo offreRepo;


	
	
    public Offer addOffer(Offer offer) {
        return offreRepo.save(offer);
    }

    
    public void deleteOffer(Long idOffer) {
        offreRepo.deleteById(idOffer);
        System.out.println("Offer deleted");
    }

    
    public Offer FindOffer(Long idOffer) {
    	Offer a = offreRepo.findById(idOffer).orElse(null);
		System.out.println(a);
		return (a);
	}
    
    public void UpdateOffer(Offer offer) {
    	offreRepo.saveAndFlush(offer);
	}
    

}
