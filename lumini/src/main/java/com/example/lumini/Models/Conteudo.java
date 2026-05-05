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
@Table(name = "Conteudo")
public class Conteudo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String resumo;

    @ManyToOne
    private Materia materia;

    @ManyToOne
    private User criadoPor;

    @Column(nullable = false)
    private Date dataCriacao;
}
