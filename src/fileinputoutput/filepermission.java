/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;

import java.io.File;

/**
 *
 * @author poudelas
 */
public class filepermission {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\1.txt");
        if(file.exists()){
            System.out.println("file is exist");
            System.out.println("Is Execute allow?"+file.canExecute());
            System.out.println("Is file can be read?"+file.canRead());
            System.out.println("Is file can be write"+file.canWrite());
        }
        file.setExecutable(false);
        file.setReadable(false);
        file.setWritable(false);
        
        System.out.println("Is Execute allow?"+file.canExecute());
            System.out.println("Is file can be read?"+file.canRead());
            System.out.println("Is file can be write"+file.canWrite());
    }
   
}
