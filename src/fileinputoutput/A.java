package fileinputoutput;

import java.io.FileReader;
import java.io.FileWriter;

public class A {

	 public static void main(String args[]){  
		  try{  
		   FileReader fw=new FileReader("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\1.txt"); 
		   FileWriter fw1 =new FileWriter("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\2.txt");
		 //  String s="my name is Saurav Shakya";
		   //char[] ch=s.toCharArray();
		   //BufferedInputStream buff=new BufferedInputStream(fw);
		   int i=0;
		   while((i=fw.read())!=-1){
			   fw1.write(i);
		   }
		   
		   //fw1.write("my name is Joker");
		   fw.close(); 
		   fw1.close();
		   
		  }catch(Exception e){System.out.println(e);}  
		  System.out.println("success");  
		 } 

}
