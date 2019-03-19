package br.com.trete.dsp20191.aulas0104.ap2;

public class UnidadeFederacao {
    private String idUF;
    private String siglaUF;
    private String nomeUF;
    private String codRegUF;

    public UnidadeFederacao (String idUF, String siglaUF, String nomeUF, String codRegUF){
        setCodRegUF(codRegUF);
        setIdUF(idUF);
        setNomeUF(nomeUF);
        setSiglaUF(siglaUF);
    }

    public String getCodRegUF() {
        return codRegUF;
    }

    public void setCodRegUF(String codRegUF) {
        this.codRegUF = codRegUF;
    }

    public String getIdUF() {
        return idUF;
    }

    public void setIdUF(String idUF) {
        this.idUF = idUF;
    }

    public String getNomeUF() {
        return nomeUF;
    }

    public void setNomeUF(String nomeUF) {
        this.nomeUF = nomeUF;
    }

    public String getSiglaUF() {
        return siglaUF;
    }

    public void setSiglaUF(String siglaUF) {
        this.siglaUF = siglaUF;
    }
}
