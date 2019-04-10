package br.com.trete.dsp20191.aulas1316.model;

public class Departamento {
    String id;
    String nome;

    public Departamento(){}

    public Departamento(String id, String nome){
        setId(id);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(String id) {
        this.id = id;
    }
}
