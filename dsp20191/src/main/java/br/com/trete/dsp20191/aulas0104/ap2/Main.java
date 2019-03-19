package br.com.trete.dsp20191.aulas0104.ap2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try{
            FileReader ler = new FileReader("src/main/resources/UF.csv");
            BufferedReader leitor = new BufferedReader(ler);

            String linha;
            String dados[];
            List<UnidadeFederacao> listaUF = new ArrayList<>();
            int contaLinhas = 1;
            while((linha = leitor.readLine()) != null){
                dados = linha.split(",");
                if ((contaLinhas > 1)&&(!linha.isEmpty())){
                    UnidadeFederacao uF = new UnidadeFederacao(dados[0], dados[1], dados[2], dados[3]);
                    listaUF.add(uF);
                }
                contaLinhas++;
            }
            for(int i = 0; i < listaUF.size();i++){
                System.out.println(listaUF.get(i).getIdUF() + " " + listaUF.get(i).getSiglaUF()+ " " +
                        listaUF.get(i).getNomeUF() + " " + listaUF.get(i).getCodRegUF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
