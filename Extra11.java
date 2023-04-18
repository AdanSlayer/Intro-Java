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
public class Extra11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = read.nextInt();
        int c=0;
        do {
           num/=10;
           c++;
            
        } while (num>=1);
        System.out.println("El numero tiene "+c+" dígitos");
        
        
        
    }
    
}
