package com.example.educacional;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")

public class Curso extends Colecao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String dataRegistro;

    public Curso(){
    }

}
