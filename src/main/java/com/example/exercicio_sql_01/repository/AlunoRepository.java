package com.example.exercicio_sql_01.repository;

import com.example.exercicio_sql_01.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}