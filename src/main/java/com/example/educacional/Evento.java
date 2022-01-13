package com.example.educacional;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")

public class Evento extends Colecao {


    private String dataInicio;
    private String dataFim;

    public Evento(){
    }
}
