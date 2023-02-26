package com.khawla.pfe.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khawla.pfe.Repositories.OffreRepo;
import com.khawla.pfe.Services.OffreService;
import com.khawla.pfe.entities.Offre;

@Controller
public class OffreController {

	
	@Autowired
    private OffreRepo offreRepo;

    @Autowired
    private OffreService offreService ;

    
    @PostMapping("/addOffre")
	@ResponseBody
	public Offre addOffre ( @RequestBody Offre offre) {
		return offreService.addOffre(offre);
	}
    
    
  
    
    @PutMapping("/deleteOffre/{idOffre}")
	@ResponseBody
	public void deleteTopic (@PathVariable Long idOffre) {
    	offreService.deleteOffre(idOffre);
		
	}
    
    @GetMapping("/FindOffre/{idOffre}")
	@ResponseBody
	public Offre FindOffre ( @PathVariable Long idOffre) {
		return offreService.FindOffre(idOffre);
	}
    
    @PutMapping("/UpdateOffre")
	@ResponseBody
	public void UpdateOffre(@RequestBody Offre offre) {
    	offreService.UpdateOffre(offre);
		
	}
}
