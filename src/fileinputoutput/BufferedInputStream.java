/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author poudelas
 */
//The Java.io.BufferedInputStream class adds functionality to another input stream, the ability to buffer the input 
//and to support the mark and reset methods. Following are the important points about BufferedInputStream:

//When the BufferedInputStream is created, an internal buffer array is created.

//As bytes from the stream are read or skipped, the internal buffer is refilled as necessary from the contained input stream,
//many bytes at a time.
public class BufferedInputStream {
    public static void main(String[] args) throws FileNotFoundException {
         File file = new File("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\1.txt");
         FileInputStream fis = null;
         BufferedInputStream bis = null;
         DataInputStream dis = null;
         
         fis = new FileInputStream(file);
         bis = new BufferedInputStream(fis);
    }

    private BufferedInputStream(FileInputStream fis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
