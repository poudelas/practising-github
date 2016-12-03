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
public class createfile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\4.txt");
        if(file.createNewFile()){
            System.out.println("file is created");
        }
        else{
            System.out.println("file is already existed");
        }
    }
}
