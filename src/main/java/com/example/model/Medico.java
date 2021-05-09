package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medico")
public class Medico {
    @Id //pra salvar como chave primária no Mongo
    private String id;
    private String nome;
    private String especialidade;
    private int crm;
    private boolean cirurgiao;

    public Medico() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public boolean isCirurgiao() {
        return cirurgiao;
    }

    public void setCirurgiao(boolean cirurgiao) {
        this.cirurgiao = cirurgiao;
    }
}
