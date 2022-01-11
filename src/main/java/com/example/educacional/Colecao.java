package com.example.educacional;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    private ArrayList<Evento> eventos;

    private List<Curso> cursos = new ArrayList<Curso>();


    // Uma COLEÇÃO está relacionada a uma lista ordenada de RECURSOS
    private ArrayList<Recurso> recursos = new List<Recurso>();


    public Colecao(String titulo, String descricao, ArrayList<Recurso> recursos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.eventos = eventos;
        this.recursos = recursos;
    }

    public Colecao() {

    }

    public void adiciona(Evento evento){
        this.eventos.add(evento);
    }

    public void adiciona(Curso curso){
        this.cursos.add(curso);
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

    @OneToMany(mappedBy = "recurso")
    @OrderBy
    public List<Recurso> getRecursos(){
        return recursos;
    }

    public void setRecursos(ArrayList<Recurso> recursos){
        this.recursos = recursos;
    }

}
