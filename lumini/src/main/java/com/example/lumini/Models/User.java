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
@Table(name = "User")
public class User implements Serializable{ 
  private static final long serialVersionUID = 1L;
  @Id //identificador para o banco de dados
  @GeneratedValue (strategy = GenerationType.IDENTITY) 
  private long id;
 
  @Column(nullable = false) 
  private String nome;

  @Column(nullable = false, unique = true) 
  private String email;

  @Column(nullable = false) 
  private String senha;
  
  @Column(nullable = false) 
  private String telefone;                                                                                                                                                                                                    }