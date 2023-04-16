package com.koyotito.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koyotito.project.model.Profesor;

@Repository
public interface ProfesorRepo extends JpaRepository<Profesor, Integer> {

}
