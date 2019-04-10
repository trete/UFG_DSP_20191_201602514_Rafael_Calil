package br.com.trete.dsp20191.aulas1316.model;

import java.util.Date;

public class Lotacao {
    Long id;
    Date dataInicial;
    Date dataFinal;
    Cargo cargo;
    Departamento departamento;

    public Lotacao(){}

    public Lotacao(Long id, Date dataInicial, Date dataFinal, Cargo cargo, Departamento departamento){
        this.id = id;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }
}


