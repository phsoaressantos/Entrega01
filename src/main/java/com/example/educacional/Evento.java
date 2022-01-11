package com.example.educacional;

import javax.persistence.*;

@Entity

public class Evento extends Colecao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String dataInicio;
    private String dataFim;

}
