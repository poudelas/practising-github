/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author poudelas
 */
public class filereader {
    public static void main(String[] args) throws IOException {
         File file = new File("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\1.txt");
      
      // creates the file
      //file.createNewFile();
      
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file); 
      
      // Writes the content to the file
      writer.write("aaja lne gako chaina yaar ho ki nai vaa t"); 
      writer.flush();
      writer.close();

      // Creates a FileReader Object
      FileReader fr = new FileReader(file); 
      char [] a = new char[50];
      fr.read(a);   // reads the content to the array
      
      for(char c : a)
         System.out.print(c);   // prints the characters one by one
      fr.close();
   }
    }

