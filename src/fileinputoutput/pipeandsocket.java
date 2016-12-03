/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;

import java.util.Arrays;

/**
 *
 * @author poudelas
 */
public class pipeandsocket {
    public static void main(String[] args) {
         int pipen = 10;
         int pipesize = 2;
         int socketn = 8;
         int socketsize = 2;
        int[][] pipe = new int[pipesize][pipen];
        int[][] sockett = new int[socketsize][socketn];
        
        //  int[] a = {1,2,4,5,6,7,8};
        // int[]b = {3,5,7,2,1,8,4};
        for (int[] pipe1 : pipe) {
            for (int[] sockett1 : sockett) {
                if (pipe1.length == sockett1.length) {
                    System.out.println(Arrays.toString(pipe1));
                    System.out.println(Arrays.toString(sockett1));
                }
                if (pipe1.length > sockett1.length) {
                    System.out.println("greater then sockett" + Arrays.toString(pipe1));
                    System.out.println("greater then sockett" + Arrays.toString(sockett1));
                }
                if (pipe1.length < sockett1.length) {
                    System.out.println("smaller then sockett" + Arrays.toString(pipe1));
                    System.out.println("smaller then sockett" + Arrays.toString(sockett1));
                }
            }
        }
    }
}
