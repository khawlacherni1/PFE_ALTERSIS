package com.khawla.pfe.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userId;

    @Column(name = "Login", nullable = false)
    String Login;

    @Column(name = "MotPasse", nullable = false)
    String MotPasse;

    @Column(name = "Nom", nullable = false)
    String Nom;

    @Column(name = "Prenom", nullable = false)
    String Prenom;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    Role role;

    String PhoneNumber;

    String email;
    
    @JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	Set<Offre> offre; //postuler un offre

}
