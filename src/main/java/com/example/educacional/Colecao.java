package com.example.educacional;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity


public class Colecao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 1024)
    private String titulo;

    @Column(length = 4096)
    private String descricao;

    // uma colecao possui uma lista ordenada de recursos
    private List<Recurso> recursos = new List<Recurso>() {
    };

    public Colecao() {
    }

    public Colecao(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Colecao(String titulo, String descricao, List<Recurso> recursos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.recursos = recursos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Colecao{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
