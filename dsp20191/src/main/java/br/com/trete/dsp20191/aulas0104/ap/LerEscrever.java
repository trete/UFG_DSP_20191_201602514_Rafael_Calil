package br.com.trete.dsp20191.aulas0104.ap;
import java.io.*;

public class LerEscrever {

    public static void main(String[] args) {
        try{
            String texto = "Toda vez que eu chego em casa, a barata da vizinha está na minha cama!";

            File arquivo = new File("src/main/resources/arquivo.txt");

            if(!arquivo.exists()){
                arquivo.createNewFile();
            }

            FileWriter criador = new FileWriter(arquivo.getAbsoluteFile());

            BufferedWriter escritor = new BufferedWriter(criador);

            escritor.write(texto);
            escritor.close();

            FileReader ler = new FileReader("src/main/resources/arquivo.txt");
            BufferedReader leitor = new BufferedReader(ler);

            String linha;
            while((linha = leitor.readLine()) != null){
                System.out.println(linha);
            }

            RelerReescrever.reescreverArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
