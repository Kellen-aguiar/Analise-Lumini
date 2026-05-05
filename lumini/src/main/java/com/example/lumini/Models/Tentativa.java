
package com.example.lumini.Models;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tentativa")
public class Tentativa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User usuario;

    @ManyToOne
    private Exercicios exercicio;

    @ManyToOne
    private Alternativa alternativaEscolhida;

    @Column(nullable = false)
    private String correta;

    @Column(nullable = false)
    private Date dataResposta;

    @Column(nullable = false)
    private Double tempoGasto;
}