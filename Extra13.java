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
public class Extra13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int h = read.nextInt();
        String cad="";
        for (int i = 1; i <= h; i++) {
            cad=cad+i;
            System.out.println(" "+cad);
        }
        
    }
}
