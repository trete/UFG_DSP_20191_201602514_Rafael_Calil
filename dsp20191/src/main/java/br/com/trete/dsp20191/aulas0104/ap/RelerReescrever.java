package br.com.trete.dsp20191.aulas0104.ap;
import java.io.*;

public class RelerReescrever {

    public static void reescreverArquivo(){
        try{

            BufferedWriter reescritor = new BufferedWriter(new FileWriter("src/main/resources/arquivo.txt"));

            String novoTexto = "\nSing hey! for the bath at close of day \n" +
                    "that washes the weary mud away! \nA loon is he that will not sing: \n" +
                    "O! Water Hot is a noble thing! \n" + "O! Sweet is the sound of falling rain, \n" +
                    "and the brook that leaps from hill to plain; \n" + "but better than rain or rippling streams \n" +
                    "is Water Hot that smokes and steams. \n" + "O! Water cold we may pour at need \n" +
                    "down a thirsty throat and be glad indeed; \n" + "but better is Beer if drink we lack, \n" +
                    "and Water Hot poured down the back. \n" + "O! Water is fair that leaps on high \n" +
                    "in a fountain white beneath the sky; \n" + "but never did fountain sound so sweet \n" +
                    "as splashing Hot Water with my feet!";

            reescritor.write(novoTexto);
            reescritor.close();

            FileReader reler = new FileReader("src/main/resources/arquivo.txt");
            BufferedReader releitor = new BufferedReader(reler);

            String novaLinha;
            while((novaLinha = releitor.readLine()) != null){
                System.out.println(novaLinha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
