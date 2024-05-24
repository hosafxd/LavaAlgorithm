/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lava;

import java.util.*;

/**
 *
 * @author FurkanÖztürk
 */
public class Lava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 10 numbers representing the rock formations in the valley:  ");
        int[] block = new int[10];
        int[] blockrev = new int[10];
        for (int i = 9; i > -1; i--) {
            blockrev[i] = sc.nextInt();
            block[block.length-(i+1)] = blockrev[i];
        }
       
        // for (int i = 0; i < 10; i++) {
          // System.out.print(block[i] + " "+blockrev[i] + " ");
             
           
          
         //}
         int aa =0;
         int aarev=0;
        int initialint = block[0];
        int initialintrev = blockrev[0];
        int lava = 0;
      int max=0;
        for (int i = 0; i < block.length; i++) {
            if (block[i] > max) {
                max = block[i];
                aa=i;
                aarev= 9-i;
            }
        }

/*
        for (int i = 1; i < block.length; i++) {
            if (initialint < block[i]) {
                for (int x = 1; i - x > 0; x++) {
                    lava += (initialint - block[i - x]);
                }
                 initialint=block[i];
               
            }
             
        }
        
        
       
     /*    for (int i = 1; i < block.length; i++) {
            if (initialint < block[i]) {
                for (int x = 1; i - x > 0; x++) {
                    lava += (block[aa] - block[i - x]);
                }
               
               break;
            }
             
        }
        
        
        
        
         for (int i = 1; i < blockrev.length; i++) {
            if (initialintrev < blockrev[i]) {
                for (int x = 1; i - x > 0; x++) {
                    lava += (initialintrev - blockrev[i - x]);
                }
               break;
            }
             
        }
         
         */
         
        System.out.println(aa +" "+ aarev);
    }
}
