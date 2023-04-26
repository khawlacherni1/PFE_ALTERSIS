package com.khawla.pfe.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

import com.khawla.pfe.ResourceNotFoundException;
import com.khawla.pfe.Repositories.OffreRepo;
import com.khawla.pfe.Services.OffreService;
import com.khawla.pfe.entities.Offer;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
@RequestMapping("/api/v1/")
public class OffreController {

	
	@Autowired
    private OffreRepo offreRepo;

    @Autowired
    private OffreService offreService ;

    @GetMapping("/Offers")
    @ResponseBody
	public List<Offer> getAllOffers(){
		return offreRepo.findAll();
	}
    
    
    
    @PostMapping("/Offers")
	@ResponseBody
	public Offer addOffer ( @RequestBody Offer offer) {
		return offreService.addOffer(offer);
	}
    
    
  
    @DeleteMapping("/Offers/{idOffer}")
	@ResponseBody
	public void deleteOffer (@PathVariable Long idOffer) {
    	offreService.deleteOffer(idOffer);
		
	}
    
    @GetMapping("/Offers/{idOffer}")
    @ResponseBody
	public ResponseEntity<Offer> getOfferById(@PathVariable Long idOffer) {
		Offer offer = offreRepo.findById(idOffer).orElseThrow(() -> new ResourceNotFoundException("offer not exist with id :" + idOffer));
		return ResponseEntity.ok(offer);
	}
    
    @GetMapping("/FindOffer/{idOffer}")
	@ResponseBody
	public Offer FindOffer ( @PathVariable Long idOffer) {
		return offreService.FindOffer(idOffer);
	}
    
    @PutMapping("/Offers")
	@ResponseBody
	public void UpdateOffer(@RequestBody Offer offer) {
    	offreService.UpdateOffer(offer);
		
	}
}
