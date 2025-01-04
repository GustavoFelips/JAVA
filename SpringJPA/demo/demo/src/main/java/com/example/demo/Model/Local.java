package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "localizacao")
public class Local {
    @Id
    private Long id_local;
    private String nome_regiao;
    private String uf;
    private String municipio;

    // Getters e Setters

    public Long getId_local() {
        return id_local;
    }

    public void setId_local(Long id_local) {
        this.id_local = id_local;
    }

    public String getNome_regiao() {
        return nome_regiao;
    }

    public void setNome_regiao(String nome_regiao) {
        this.nome_regiao = nome_regiao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
