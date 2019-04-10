package br.com.trete.dsp20191.aulas1316.model;

public class Cargo {
    String id;
    String nome;
    double salario;

    public Cargo(){}

    public Cargo(String id, String nome, double salario){
        setId(id);
        setNome(nome);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
}