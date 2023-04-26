package com.khawla.pfe.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Offer")
public class Offer {
	
	
	
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    Long idOffer;

	    @Column(name = "description", nullable = false)
	    String description;

		public Long getIdOffer() {
			return idOffer;
		}

		public void setIdOffer(Long idOffer) {
			this.idOffer = idOffer;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Offer(Long idOffer, String description) {
			super();
			this.idOffer = idOffer;
			this.description = description;
		}

		public Offer() {
			super();
		}

		@Override
		public String toString() {
			return "Offer [description=" + description + "]";
		}

	    
	   /* @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
	    @PrimaryKeyJoinColumn*/
	    
	    
	    
	   
	    
	    
	    /*@OneToOne(mappedBy = "Offre")
	    Questionnaire questionnaire;*/

	    
	    
}
