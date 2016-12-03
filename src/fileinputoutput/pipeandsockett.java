/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;

/**
 *
 * @author poudelas
 */
public class pipeandsockett {
    public static void main(String[] args) {
        int pipen = 8;
        int socketn = 8;
        int[] pipe = {1,33,55,44,77,88,24,65,76};
        int[] socket = {55,47,24,54,56,29,84,65,66,56};
        for(int i=0;i<pipe.length;i++){
            for(int j=0;j<socket.length;j++){
               if(pipe[i]==socket[j]){
                   System.out.println("matched   "+pipe[i]+","+socket[j]);
               }
               if(pipe[i]>socket[j]){
                   System.out.println("pipe is greater     "+pipe[i]+">"+socket[j]);
               }
               if(pipe[i]<socket[j]){
                   System.out.println("socket is greater     "+pipe[i]+"<"+socket[j]);
               }
            }
        }
    }
}
