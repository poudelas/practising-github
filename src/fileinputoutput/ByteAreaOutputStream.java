package fileinputoutput;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteAreaOutputStream {
	public static String hobby;
	static {
		hobby="i love playing guitar";
	}

	public static void main(String[] args) throws IOException {

		try{
		FileOutputStream fout1 =new FileOutputStream("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\1.txt");
		FileOutputStream fout2 =new FileOutputStream("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\2.txt");
		FileInputStream fin =new FileInputStream("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\3.txt");
                
                //The ByteArrayOutputStream class stream creates a buffer in memory
                //and all the data sent to the stream is stored in the buffer.
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
//byte[] b=ByteAreaOutputStream.hobby.getBytes();	
		int i=0;
		while((i=fin.read())!=-1){
			 bout.write(i);
		}
  
   bout.writeTo(fout1);
   bout.writeTo(fout2);
   bout.flush();
		}catch(Exception e){
			System.out.println("error caught");
		}
		}

	}


