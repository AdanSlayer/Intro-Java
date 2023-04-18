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
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num,mult;
        System.out.println("Adivina la multiplicación entre dos números aleatorios");
        do {
            num=read.nextInt();
            mult=(int) ((Math.random()*2)*(Math.random()*2));
            System.out.println(mult);
            if (mult!=num) {
                System.out.println("Ingrese otro número");
            }
        } while (mult!=num);
        System.out.println("Adivinaste el número");
    }
    
}
