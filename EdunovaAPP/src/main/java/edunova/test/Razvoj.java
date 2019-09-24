/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author Admin
 */
public class Razvoj {

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            URL url = new URL("http://oib.itcentrala.com/oib-generator/");
            br = new BufferedReader(new InputStreamReader(url.openStream()));
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
            System.out.println(sb);
            //lošije
            //System.out.println(rez);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
