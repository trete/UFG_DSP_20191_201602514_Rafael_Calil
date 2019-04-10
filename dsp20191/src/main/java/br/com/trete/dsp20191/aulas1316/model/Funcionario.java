package br.com.trete.dsp20191.aulas1316.model;

public class Funcionario {
    Long id;
    String nome;
    Long matricula;

    public Funcionario(){}

    public Funcionario(Long id, String nome, Long matricula){
        setId(id);
        setNome(nome);
        setMatricula(matricula);
    }
    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }
}
