/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.utility;

import java.io.File;
import java.net.URL;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 *
 * @author Admin
 */
public class RazvojHibConf {
    
    
    public static void main(String[] args) {
        URL path = RazvojHibConf.class.getResource("/hibernatePrazno.cfg.xml");
        File hibc=new File(path.getFile());
//        System.out.println("Krenuo");
//        if(hibc.exists()){
//            System.out.println("Dobro je");
//        }

        try {
             Document doc = DocumentBuilderFactory.newInstance()
            .newDocumentBuilder().parse(new InputSource(path.getFile()));
             
             
             XPath xpath = XPathFactory.newInstance().newXPath();
            Node node  = (Node)xpath.evaluate("//property[@name='connection.url']",
                                          doc, XPathConstants.NODE);
            String baza="edunovaj21_hib";
            
        
            //nakon što nađem element, pristupim atributu i postavim vrijdnost
            System.out.println(node.getFirstChild().getNodeValue());
            node.getFirstChild().setNodeValue("jdbc:mariadb://localhost/" + baza + "?useSSL=false");

            Transformer xformer = TransformerFactory.newInstance().newTransformer();
xformer.transform(new DOMSource(doc), new StreamResult(new File(path.getFile())));

        } catch (Exception e) {
            e.printStackTrace();
        }
       

    }
}
