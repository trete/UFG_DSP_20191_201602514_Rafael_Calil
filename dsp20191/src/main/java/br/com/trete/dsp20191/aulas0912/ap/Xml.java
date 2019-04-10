package br.com.trete.dsp20191.aulas0912.ap;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Xml {
    public static List<Node> xmlParaLista(String xmlPath) throws DocumentException {
        File xml = new File(xmlPath);
        SAXReader leitor = new SAXReader();
        Document documento = leitor.read(xml);
        return documento.selectNodes("/class/student");
    }

    public static Node selecionarElementoXml(String xmlPath, String numMatricula) throws DocumentException {
        File xml = new File(xmlPath);
        SAXReader leitor = new SAXReader();
        Document documento = leitor.read(xml);
        List<Node> listaXml = documento.selectNodes("/class/student[@matricula = 'matricula']");
        System.out.println(" :O");
        return listaXml.get(0);
    }

    public static void imprimirXml(List<Node> listaXml){
        for (Node node : listaXml){
            auxImprimirXml("matricula", node);
            auxImprimirXml("firstname", node);
            auxImprimirXml("lastname", node);
            auxImprimirXml("nickname", node);
            System.out.println(node.selectSingleNode("frequencia").getName() + ": " +
                    node.selectSingleNode("frequencia").getStringValue().
                            replace("\n", " ").replace(" ", ""));
            System.out.println("\n");
        }
    }

    public static void auxImprimirXml(String tipo, Node node){
        System.out.println(node.selectSingleNode(tipo).getName() + ": " +
                node.selectSingleNode(tipo).getText());
    }

    public static void criarDocumentoIndividual(Node node) throws IOException {

        Document documento = DocumentHelper.createDocument();
        System.out.println(node.selectSingleNode("matricula").getText());
        Element root = documento.addElement(node.getText());
        Element estudante = root.addElement(node.getText()).addAttribute
                (node.selectSingleNode("matricula").getName(), node.selectSingleNode("matricula").getText());

        estudante.addElement(node.getNodeTypeName()).addAttribute
                (node.selectSingleNode("firstname").getName(), node.selectSingleNode("firstname").getText());

        estudante.addElement(node.getNodeTypeName()).addAttribute
                (node.selectSingleNode("firstname").getName(), node.selectSingleNode("firstname").getText());

        estudante.addElement(node.getNodeTypeName()).addAttribute
                (node.selectSingleNode("lastname").getName(), node.selectSingleNode("lastname").getText());

        estudante.addElement(node.getNodeTypeName()).addAttribute
                (node.selectSingleNode("nickname").getName(), node.selectSingleNode("nickname").getText());

        estudante.addElement(node.getNodeTypeName()).addAttribute
                (node.selectSingleNode("frequencia").getName(), node.selectSingleNode("frequencia").toString());

        OutputFormat formato = OutputFormat.createPrettyPrint();
        XMLWriter escritor;
        escritor = new XMLWriter(System.out, formato);
        escritor.write(documento);
    }
}
