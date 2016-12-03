/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author poudelas
 */
public class fileinputstream {
    	public static void main(String[] args) {

		File file = new File("C:\\Users\\poudelas\\Documents\\NetBeansProjects\\1.txt");

		try (FileInputStream fis = new FileInputStream(file)) {

			System.out.println("Total file size to read (in bytes) : "+ fis.available());

			int content;
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				System.out.print(content);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
