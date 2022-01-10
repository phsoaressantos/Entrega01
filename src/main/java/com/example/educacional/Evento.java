package com.example.educacional;

import javax.persistence.Entity;
import java.util.Date;

@Entity

public class Evento extends Colecao {

    private Date dataInicio;
    private Date dataFim;

    public Evento(String titulo, String descricao, Date dataInicio, Date dataFim) {
        super(titulo, descricao);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
