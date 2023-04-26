package com.khawla.pfe.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khawla.pfe.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
