package com.khawla.pfe.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.khawla.pfe.entities.Offer;


@Repository
public interface OffreRepo extends JpaRepository<Offer, Long>{


}
