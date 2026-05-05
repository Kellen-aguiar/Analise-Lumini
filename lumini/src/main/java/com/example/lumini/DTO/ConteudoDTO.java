package com.example.lumini.DTO;

import java.io.Serializable;
import java.util.Date;

import com.example.lumini.Models.Conteudo;

public class ConteudoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String titulo;
    private String descricao;
    private String resumo;
    private Long materiaId;
    private Long criadoPorId;
    private Date dataCriacao;

    public ConteudoDTO() {}

    public ConteudoDTO(Conteudo entity) {
        this.id = entity.getId();
        this.titulo = entity.getTitulo();
        this.descricao = entity.getDescricao();
        this.resumo = entity.getResumo();
        this.materiaId = entity.getMateria().getId();
        this.criadoPorId = entity.getCriadoPor().getId();
        this.dataCriacao = entity.getDataCriacao();
    }

    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public String getResumo() { return resumo; }
    public Long getMateriaId() { return materiaId; }
    public Long getCriadoPorId() { return criadoPorId; }
    public Date getDataCriacao() { return dataCriacao; }

    public void setId(Long id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setResumo(String resumo) { this.resumo = resumo; }
    public void setMateriaId(Long materiaId) { this.materiaId = materiaId; }
    public void setCriadoPorId(Long criadoPorId) { this.criadoPorId = criadoPorId; }
    public void setDataCriacao(Date dataCriacao) { this.dataCriacao = dataCriacao; }
}