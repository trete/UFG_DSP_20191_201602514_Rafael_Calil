package br.com.trete.dsp20191.aulas0508.ap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Conexao {
    private String sgbd;
    private String tipoConexao;
    private String bancoDados;
    private String urlBd;
    private String sistemaOperacional;

    public Conexao(String sgbd, String tipoConexao, String bancoDados, String urlBd, String sistemaOperacional){
        setSgbd(sgbd);
        setTipoConexao(tipoConexao);
        setBancoDados(bancoDados);
        setUrlBd(urlBd);
        setSistemaOperacional(sistemaOperacional);
    }

    public Conexao (String propertiesPath){
        final String OS = System.getProperty("os.name").toLowerCase();
        setSgbd(lerPropriedades(propertiesPath).get(3));
        setTipoConexao(lerPropriedades(propertiesPath).get(4));
        setBancoDados(lerPropriedades(propertiesPath).get(5));
        setUrlBd(lerPropriedades(propertiesPath).get(6));
        setSistemaOperacional(OS);
    }

    public List<String> lerPropriedades(String propertiesPath){
        List<String> listaPropriedades = new ArrayList();
        try{
            File propriedades = new File(propertiesPath);

            FileReader instanciarPropriedadees = new FileReader(propriedades);

            BufferedReader leitorPropriedades = new BufferedReader(instanciarPropriedadees);

            String linha = "linha";
            String propriedade[];
            while(linha != null) {
                linha = leitorPropriedades.readLine();
                if(linha != null){
                    propriedade = linha.split("=");
                    listaPropriedades.add(propriedade[1]);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return listaPropriedades;
    }

    public String getSgbd() {
        return sgbd;
    }

    public void setSgbd(String sgbd) {
        this.sgbd = sgbd;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public String getBancoDados() {
        return bancoDados;
    }

    public void setBancoDados(String bancoDados) {
        this.bancoDados = bancoDados;
    }

    public String getUrlBd() {
        return urlBd;
    }

    public void setUrlBd(String urlBd) {
        this.urlBd = urlBd;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
