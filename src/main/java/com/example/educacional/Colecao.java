package com.example.educacional;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)

public class Colecao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 1024)
    private String titulo;

    @Column(length = 4096)
    private String descricao;


    public Recurso getColecao() {
        return colecao;
    }

    public void setColecao(Recurso colecao) {
        this.colecao = colecao;
    }

    //  private ArrayList<Evento> eventos;
    //   private List<Curso> cursos = new ArrayList<Curso>();
    //   private List<Recurso> recursos;
    // Uma COLEÇÃO está relacionada a uma lista ordenada de RECURSOS
    //   private ArrayList<Recurso> recursos = new List<Recurso>();
    public Colecao() {

    }

    public Colecao(String titulo, String descricao, ArrayList<Recurso> recursos) {
        this.titulo = titulo;
        this.descricao = descricao;
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

    // **Métodos para Associações **
    @ManyToOne
    @JoinColumn(name = "colecao_id")
    private Recurso colecao;


}
