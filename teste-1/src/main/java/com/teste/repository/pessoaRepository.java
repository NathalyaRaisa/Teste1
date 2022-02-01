package com.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.entity.pessoa;

@Repository
public interface pessoaRepository extends JpaRepository<pessoa, Integer> {

}
