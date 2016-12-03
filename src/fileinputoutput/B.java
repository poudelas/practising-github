package fileinputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

import javax.xml.bind.util.ValidationEventCollector;

public class B {
	public static void main(String[] args)throws IOException{
		try{
			FileInputStream fin1= new FileInputStream("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\1.txt");
			FileInputStream fin2 =new FileInputStream("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\2.txt");
			//FileInputStream fin3 =new FileInputStream("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\1.txt");
			FileOutputStream fout =new FileOutputStream("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\3.txt");
			Vector v =new Vector();
			v.add(fin1);
			v.add(fin2);
			//v.add(fin3);
                         // enumerate the elements in the vector.
			Enumeration e=v.elements();
                        //The Java.io.SequenceInputStream class represents the logical concatenation of other input streams. ... 
                        //This method reads the next byte of data from this input stream. ... 
                        //This method reads up to len bytes of data from this input stream into an array of bytes.
			java.io.SequenceInputStream sis = new SequenceInputStream(e);
			int i=0;
			while((i=sis.read())!=-1){
			fout.write((byte)i);	
				
			}
			fout.close();
			fin1.close();
			fin2.close();
			//fin3.close();
			sis.close();
		
 			
			
		}catch(Exception e){
			System.out.println("exception caught");
		}
		
		
	}

}
