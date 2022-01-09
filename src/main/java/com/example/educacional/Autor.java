package com.example.educacional;


import javax.persistence.*;

@Entity

public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 256)
    private String email;

    @Column(length = 64)
    private String nome;

    @Column(length = 64)
    private String sobrenome;

    @Column(length = 256)
    private String afiliacao;

    @Column(length = 20)
    private String orcid;

    public Autor() {
    }

    public Autor(String email, String nome, String sobrenome, String afiliacao, String orcid) {

        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.afiliacao = afiliacao;
        this.orcid = orcid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    public String getOrcid() {
        return orcid;
    }

    public void setOrcid(String orcid) {
        this.orcid = orcid;
    }
}
