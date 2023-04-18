package guia7_ex6;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num= read.nextInt();
        System.out.println("El doble del numero es: "+ (num*2));
        System.out.println("El triple del numero es: "+ (num*3));
        System.out.println("La raiz cuadrada del numero es: "+Math.sqrt(num));
    }
}
