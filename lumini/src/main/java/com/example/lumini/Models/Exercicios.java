package com.example.lumini.Models;


import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Exercicio")
public class Exercicios implements Serializable{ 
  private static final long serialVersionUID = 1L; 
  @Id 
  @GeneratedValue (strategy = GenerationType.IDENTITY) 
  private long id;
 
  @Column(nullable = false) 
  private String enunciado;

  @Column(nullable = false, unique = true) 
  private String materia;

  @Column(nullable = false)
  private String conteudo;
  
  @Column(nullable = false)
  private String nivelDificuldade;

  @Column(nullable = false, unique = true)
  private String alternativas;

  @Column(nullable = false)
  private int respostaCorreta;

}