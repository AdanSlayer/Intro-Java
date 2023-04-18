/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 *
 * @author USER
 */
public class Extra16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name="";
        int age=0, i=0;
        imprimir(name, age, i);
        
    }

    public static void imprimir(String name, int age,int i) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int n = read.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("Ingrese el nombre de la persona "+i);
            name = read.next();
            System.out.println("Ingrese la edad de la persona "+i);
            age = read.nextInt();
            if (age<18) {
                System.out.println("La persona NO es legal");
                
            } else{System.out.println("La persona ya es legal");}
        }
    }

}
