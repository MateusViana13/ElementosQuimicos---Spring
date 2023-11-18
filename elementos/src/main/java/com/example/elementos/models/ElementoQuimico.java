package com.example.elementos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "elementoquimico")
@Entity(name = "elementoquimico")
public class ElementoQuimico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id;

    public String simbolo;
    public String nome;
    public int numeroAtomico;
    public double massaAtomica;
    public String grupo;
    public String periodo;

    public ElementoQuimico() {
        // Construtor padrão vazio necessário para JPA
    }

    // Getters e Setters para os campos

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public double getMassaAtomica() {
        return massaAtomica;
    }

    public void setMassaAtomica(double massaAtomica) {
        this.massaAtomica = massaAtomica;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
