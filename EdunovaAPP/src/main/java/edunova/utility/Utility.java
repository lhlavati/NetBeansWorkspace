/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.w3c.dom.Document;

/**
 *
 * @author Admin
 */
public class Utility {
    
    public static String getNazivAplikacije(){
        return "Edunova APP V1";
    }
    
    public static String getFormatDatumaIVremena(){
        return "dd. MM. YYYY. HH:mm:ss";
    }
    
    public static boolean isDev(){
        return true;
    }

    public static String dohvatiOib() {
       
        String html = 
                Utility.ucitajURL("http://oib.itcentrala.com/oib-generator/");
        if (html==null){
            return null;
        }
        
        TagNode root = new HtmlCleaner().clean(html);
        
        try {
            Document doc = new DomSerializer(new CleanerProperties()).createDOM(root);
            XPath xPath = XPathFactory.newInstance().newXPath();
            String oib = (String)xPath.evaluate("/html/body/div[1]/div[1]/text()", 
                    doc,XPathConstants.STRING);

            return oib;
        } catch (Exception ex) {
            
        }
        
        
        return null;
    }
    
    public static String ucitajURL(String adresa){
        try {
            URL url = new URL(adresa);
            InputStreamReader isr = new InputStreamReader(url.openStream(), "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            StringBuilder sb = new StringBuilder();
            //lošije
           // String rez="";
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                //lošije
                //rez+=line+"\n";
            }
            return sb.toString();
            //lošije
            //System.out.println(rez);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    
    public static Date convertToDateViaInstant(LocalDate dateToConvert) {
        return java.util.Date.from(dateToConvert.atStartOfDay()
          .atZone(ZoneId.systemDefault())
            .toInstant());
    }
}
