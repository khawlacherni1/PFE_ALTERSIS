package com.khawla.pfe.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khawla.pfe.entities.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer>{

}
