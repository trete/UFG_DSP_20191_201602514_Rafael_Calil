package br.com.trete.aulas2528;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Veiculo implements Serializable{
    @GeneratedValue
    @Id
    Long id;
    String marca;
    String modelo;
    Integer anoFabricacao;
    Integer anoModelo;
    Integer potenciaMotor;

    public Veiculo(){}

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public Integer getPotenciaMotor() {
        return potenciaMotor;
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setPotenciaMotor(Integer potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", anoModelo=" + anoModelo +
                ", potenciaMotor=" + potenciaMotor +
                '}';
    }
}