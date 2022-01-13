package com.example.educacional;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")

public class Curso extends Colecao {

    private String dataRegistro;

    public Curso(){
    }

}
