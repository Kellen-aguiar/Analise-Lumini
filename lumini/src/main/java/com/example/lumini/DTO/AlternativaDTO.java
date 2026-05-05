package com.example.lumini.DTO;

import java.io.Serializable;

import com.example.lumini.Models.Alternativa;

public class AlternativaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String texto;
    private String explicacao;

    public AlternativaDTO() {}

    public AlternativaDTO(Alternativa entity) {
        this.id = entity.getId();
        this.texto = entity.getTexto();
        this.explicacao = entity.getExplicacao();
    }

    public Long getId() { return id; }
    public String getTexto() { return texto; }
    public String getExplicacao() { return explicacao; }

    public void setId(Long id) { this.id = id; }
    public void setTexto(String texto) { this.texto = texto; }
    public void setExplicacao(String explicacao) { this.explicacao = explicacao; }
}