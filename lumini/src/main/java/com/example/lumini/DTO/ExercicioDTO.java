package com.example.lumini.DTO;

import java.io.Serializable;

import com.example.lumini.Models.Exercicios;

public class ExercicioDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String enunciado;
    private String materia;
    private String nivelDificuldade;

    public ExercicioDTO() {}

    public ExercicioDTO(Long id, String enunciado, String materia, String nivelDificuldade) {
        this.id = id;
        this.enunciado = enunciado;
        this.materia = materia;
        this.nivelDificuldade = nivelDificuldade;
    }

    public ExercicioDTO(Exercicios entity) {
        this.id = entity.getId();
        this.enunciado = entity.getEnunciado();
        this.materia = entity.getMateria();
        this.nivelDificuldade = entity.getNivelDificuldade();
    }

    public Long getId() { return id; }
    public String getEnunciado() { return enunciado; }
    public String getMateria() { return materia; }
    public String getNivelDificuldade() { return nivelDificuldade; }

    public void setId(Long id) { this.id = id; }
    public void setEnunciado(String enunciado) { this.enunciado = enunciado; }
    public void setMateria(String materia) { this.materia = materia; }
    public void setNivelDificuldade(String nivelDificuldade) { this.nivelDificuldade = nivelDificuldade; }
}