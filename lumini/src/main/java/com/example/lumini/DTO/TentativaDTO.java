package com.example.lumini.DTO;

import java.io.Serializable;
import java.util.Date;

import com.example.lumini.Models.Tentativa;

public class TentativaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long usuarioId;
    private Long exercicioId;
    private Long alternativaId;
    private String correta;
    private Date dataResposta;
    private Double tempoGasto;

    public TentativaDTO() {}

    public TentativaDTO(Tentativa entity) {
        this.id = entity.getId();
        this.usuarioId = entity.getUsuario().getId();
        this.exercicioId = entity.getExercicio().getId();
        this.alternativaId = entity.getAlternativaEscolhida().getId();
        this.correta = entity.getCorreta();
        this.dataResposta = entity.getDataResposta();
        this.tempoGasto = entity.getTempoGasto();
    }

    public Long getId() { return id; }
    public Long getUsuarioId() { return usuarioId; }
    public Long getExercicioId() { return exercicioId; }
    public Long getAlternativaId() { return alternativaId; }
    public String getCorreta() { return correta; }
    public Date getDataResposta() { return dataResposta; }
    public Double getTempoGasto() { return tempoGasto; }

    public void setId(Long id) { this.id = id; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }
    public void setExercicioId(Long exercicioId) { this.exercicioId = exercicioId; }
    public void setAlternativaId(Long alternativaId) { this.alternativaId = alternativaId; }
    public void setCorreta(String correta) { this.correta = correta; }
    public void setDataResposta(Date dataResposta) { this.dataResposta = dataResposta; }
    public void setTempoGasto(Double tempoGasto) { this.tempoGasto = tempoGasto; }
}