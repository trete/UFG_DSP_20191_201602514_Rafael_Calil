package br.com.trete.dsp20191.aulas0912.ap;
import org.dom4j.DocumentException;
import static br.com.trete.dsp20191.aulas0912.ap.Xml.imprimirXml;
import static br.com.trete.dsp20191.aulas0912.ap.Xml.xmlParaLista;

public class ImprimirDadosXml {

    public static void main(String[] args) {
        try{
            imprimirXml(xmlParaLista("src/main/resources/students.xml"));
        }catch(DocumentException e){
            e.printStackTrace();
        }
    }
}
