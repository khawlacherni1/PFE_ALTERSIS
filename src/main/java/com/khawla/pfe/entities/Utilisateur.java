package com.khawla.pfe.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

}
