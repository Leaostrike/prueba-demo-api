package com.ejemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.entity.Grado;

public interface GradoRepository extends JpaRepository<Grado, Integer> {

}
