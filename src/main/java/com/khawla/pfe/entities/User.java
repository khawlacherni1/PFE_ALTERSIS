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
@Table(name = "User")
public class User {
	
	

		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    Long userId;


	    @Column(name = "MotPasse", nullable = false)
	    String MotPasse;

	    

	    @Enumerated(EnumType.STRING)
	    @Column(name = "role", nullable = false)
	    Role role;

	    String PhoneNumber;

	    String email;

}
