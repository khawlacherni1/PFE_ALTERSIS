package com.khawla.pfe.entities;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name = "Offre")
public class Offre {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idOffre;

    @Column(name = "description", nullable = false)
    String description;

    
   /* @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn*/
    
    
    
   
    
    
    /*@OneToOne(mappedBy = "Offre")
    Questionnaire questionnaire;*/
    
    
    
    
    

	public Long getIdOffre() {
		return idOffre;
	}

	public void setIdOffre(Long idOffre) {
		this.idOffre = idOffre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Offre() {
		super();
	
	}

	@Override
	public String toString() {
		return "Offre [idOffre=" + idOffre + ", description=" + description +  "]";
	}

	public Offre(String description, Date dateOffre) {
		super();
		this.description = description;
		
	}
    
	
	
    

}
