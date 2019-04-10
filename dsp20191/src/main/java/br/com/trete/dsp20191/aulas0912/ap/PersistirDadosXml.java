package br.com.trete.dsp20191.aulas0912.ap;

import org.dom4j.DocumentException;

import java.io.IOException;

import static br.com.trete.dsp20191.aulas0912.ap.Xml.*;

public class PersistirDadosXml {
    public static void main(String[] args) {
        String matricula = "201602514";
        try{
            criarDocumentoIndividual(selecionarElementoXml("src/main/resources/students.xml", matricula));
        }catch(DocumentException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
