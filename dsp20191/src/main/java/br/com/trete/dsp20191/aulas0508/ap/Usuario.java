package br.com.trete.dsp20191.aulas0508.ap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String login;
    private String senha;

    public Usuario(String nome, String login, String senha){
        setNome(nome);
        setLogin(login);
        setSenha(senha);
    }

    public Usuario(String propertiesPath){
        setNome(lerPropriedades(propertiesPath).get(0));
        setLogin(lerPropriedades(propertiesPath).get(1));
        setSenha(lerPropriedades(propertiesPath).get(2));
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
                if(linha != null) {
                    propriedade = linha.split("=");
                    listaPropriedades.add(propriedade[1]);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return listaPropriedades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
