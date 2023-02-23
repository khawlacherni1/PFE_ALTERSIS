package com.khawla.pfe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Questionnaire")
public class Questionnaire {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idQuestionnaire;

    
    /*@OneToOne(mappedBy = "questionnaire")
    Offre offre ;*/
    
}
