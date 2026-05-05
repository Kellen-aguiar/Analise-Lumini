package com.example.lumini.Models;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Alternativa")
public class Alternativa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Exercicios exercicio;

    @Column(nullable = false)
    private String texto;

    @Column(nullable = false)
    private String correta;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String explicacao;
}
