package fileinputoutput;

import java.io.*;

//import java.io.FileWriter;

public class C {
	 public static void main(String args[])throws Exception{  
		  
		  CharArrayWriter out=new CharArrayWriter();  
		  out.write("my name is joker");  
		  
		  FileWriter f1=new FileWriter("C:/Users/user/Desktop/abc.txt");  
		  FileWriter f2=new FileWriter("C:/Users/user/Desktop/1.txt");  
		  FileWriter f3=new FileWriter("C:/Users/user/Desktop/2.txt");  
		  FileWriter f4=new FileWriter("C:/Users/user/Desktop/3.txt");  
		  
		  out.writeTo(f1);  
		  out.writeTo(f2);  
		  out.writeTo(f3);  
		  out.writeTo(f4);  
		  
		  
		  f1.close();  
		  f2.close();  
		  f3.close();  
		  f4.close();  
		 }  
	  
	 

}
