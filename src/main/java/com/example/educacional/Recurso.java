package com.example.educacional;

import javax.persistence.*;
import java.util.*;

@Entity

public class Recurso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 1024)
    private String titulo;

    @Column(length = 4096)
    private String descricao;

    private String dataCriacao;

    private String dataRegistro;

    // um recurso possui uma lista ordenada de autores
    private List<Autor> autores = new ArrayList<Autor>();

    // cada recurso esta associado palavras-chave
  //  private List<Palavraschave> palavraschaves = new ArrayList<Palavraschave>();

    public Recurso() {
    }



    public Colecao getRecurso() {
        return recurso;
    }

    public void setRecurso(Colecao recurso) {
        this.recurso = recurso;
    }


    public Recurso(String titulo, String descricao, String dataCriacao, String dataRegistro) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataRegistro = dataRegistro;
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

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public ArrayList<String> getPalavraschave() {
//        return palavraschave;
//    }
//
//    public void setPalavraschave(ArrayList<String> palavraschave) {
//        this.palavraschave = palavraschave;
//    }

    @Override
    public String toString() {
        return "Recurso{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", dataRegistro='" + dataRegistro + '\'' +
                '}';
    }

    // **Métodos para Associações **

    @OneToMany(mappedBy = "autor")
    @OrderBy

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    @ManyToOne(cascade = {CascadeType.ALL, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "recurso_id")
    private Colecao recurso;
}
