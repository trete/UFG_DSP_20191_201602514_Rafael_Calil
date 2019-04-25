package br.com.trete.dsp20191.aulas2528;

public class Veiculo {
    long id;
    String marca;
    String modelo;
    Integer anoFabricacao;
    Integer anoModelo;
    Integer potenciaMotor;

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


}
