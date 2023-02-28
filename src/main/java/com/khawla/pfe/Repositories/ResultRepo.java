package com.khawla.pfe.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khawla.pfe.entities.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer>{

}
