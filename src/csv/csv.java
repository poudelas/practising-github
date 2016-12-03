/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author poudelas
 */
public class csv {
    public static void main(String[] args) throws IOException {
        String csvfile = "C:\\Users\\poudelas\\Documents\\NetBeansProjects\\output.csv";
        FileWriter writer = new FileWriter(csvfile);
        List<Developer> developer = Arrays.asList(
                new Developer("sahadev",new BigDecimal(195847),24),
                new Developer("Anjit",new BigDecimal(195847),24),
                 new Developer("shweta",new BigDecimal(195847),24)
        );
    }
}
