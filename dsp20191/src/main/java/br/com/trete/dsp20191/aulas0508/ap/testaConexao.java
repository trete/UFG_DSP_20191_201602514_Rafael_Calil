package br.com.trete.dsp20191.aulas0508.ap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class testaConexao {
    public static void escreverPropriedades(String propertiesPath){
        File properties = new File(propertiesPath);
        try{
            FileWriter escritor = new FileWriter(properties);
            PrintWriter printer = new PrintWriter(escritor);
            printer.println("nome=Rafael Borges Calil");
            printer.println("usuario=Rafael.Calil");
            printer.println("senha=dsp20191");
            printer.println("sgbd=H2");
            printer.println("tipoConexao=memory");
            printer.println("bancoDados=dsp20191bd");
            printer.println("urlBd=localhost/dsp20191bd");
            printer.close();
            escritor.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String propertiesPath = "src/main/resources/conexao.properties";
        escreverPropriedades(propertiesPath);
        Usuario usuario = new Usuario(propertiesPath);
        Conexao conexao = new Conexao(propertiesPath);
        System.out.println("nomeUsuario: " + usuario.getNome() + "\n login: " + usuario.getLogin() + "\n senha: " +
                usuario.getSenha() + "\n sgbdConexao: " + conexao.getSgbd() + "\n tipoConexao: " +
                conexao.getTipoConexao() + "\n bancoDados: " + conexao.getBancoDados() + "\n url: " +
                conexao.getUrlBd() + "\n SO: " + conexao.getSistemaOperacional());
    }
}
