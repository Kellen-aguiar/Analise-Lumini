package com.example.lumini.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudos")
public class UserController {

     public String listarMaterias() {
        return "Matérias: Matemática, História";
    }


    @GetMapping("/exercicios")
    public String listarExercicios() {
        return "Exercícios disponíveis";
    }

    @PostMapping("/cadastro")
    public String cadastrarAluno(@RequestBody String nome) {
        return "Aluno " + nome + " cadastrado com sucesso!";
    }



}
