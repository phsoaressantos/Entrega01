package com.example.educacional;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Curso extends Colecao {

    private Date dataRegistro;
    private Date dataFim;

    public Curso(Date dataRegistro, Date dataFim) {
        this.dataRegistro = dataRegistro;
        this.dataFim = dataFim;
    }

    public Curso(String titulo, String descricao, Date dataRegistro, Date dataFim) {
        super(titulo, descricao);
        this.dataRegistro = dataRegistro;
        this.dataFim = dataFim;
    }
}
