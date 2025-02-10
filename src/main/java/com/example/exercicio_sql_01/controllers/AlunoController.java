package com.example.exercicio_sql_01.controllers;

import com.example.exercicio_sql_01.dtos.AlunoDTO;
import com.example.exercicio_sql_01.model.Aluno;
import com.example.exercicio_sql_01.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    @PostMapping
    public ResponseEntity<Aluno> adicionarAluno(@RequestBody AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        aluno.setNome(alunoDTO.getNome());
        aluno.setIdade(alunoDTO.getIdade());

        Aluno novoAluno = alunoService.salvarAluno(aluno);
        return ResponseEntity.ok(novoAluno);
    }
}