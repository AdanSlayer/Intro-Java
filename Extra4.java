/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Extra4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 10");
        int num = read.nextInt();
        String rom = " "; int i=0;
        if (num>8) {
            rom="X";
            if (num-10<0) {rom = "I"+rom;}
            else {num=10;}
                  
        }
        if (num>=4 && num<8) {
            rom= "V";
            if (num-5<0) {rom = "I"+rom;}
            else{num-=5;}
            
        }
        if (num<4) {
            while (i<num){rom+="I";i++;}
        }
        System.out.println(" = "+rom);
    }
}
