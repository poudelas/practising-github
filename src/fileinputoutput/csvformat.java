/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 import com.csvreader.CsvWriter;  
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 *
 * @author poudelas
 */
public class csvformat {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        boolean file = new File("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\output.csv").exists();
        try {
             // use FileWriter constructor that specifies open for appending
            CsvWriter csvOutput = new CsvWriter(new FileWriter("output.csv",true),','); 
           
         csvOutput.write("Name");  
         csvOutput.write("Deparment");  
         csvOutput.write("Year");  
         csvOutput.endRecord();  
       
            // write out a few records  
       for (int i = 0; i < 10; i++) {  
         csvOutput.write("Studen " + i);  
         csvOutput.write("Deparment " + i);  
         csvOutput.write("201" + i);  
         csvOutput.endRecord();  
       }  
              csvOutput.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
         // Read data from CSV file.    
     FileReader fr = new FileReader(new File("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\output.csv"));  
     BufferedReader br = new BufferedReader(fr);  
     String st;  
     while ((st = br.readLine()) != null) {  
       System.out.println(st);  
     }  
    }
}
