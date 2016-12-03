/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author poudelas
 */
public class filepath {
    public static void main(String[] args) throws IOException {
       String filename = "sahadev.txt";
       String WorkingDirectory = System.getProperty("user.dir");
       
       File file = new File(WorkingDirectory,filename);
        System.out.println("file absolute path:"+file.getAbsolutePath());
        if(file.createNewFile()){
            System.out.println("file is created");
        }
        else{
            System.out.println("file already existing");
        }
    }
   
}
