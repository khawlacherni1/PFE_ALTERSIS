package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khawla.pfe.entities.Offre;

import Repositories.OffreRepo;
import Services.OffreService;

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
	public void deleteTopic (@PathVariable Long idoffre) {
    	offreService.deleteOffre(idoffre);
		
	}
    
    @GetMapping("/FindOffre/{idOffre}")
	@ResponseBody
	public Offre FindOffre ( @PathVariable Long idOffre) {
		return offreService.FindOffre(idOffre);
	}
}
