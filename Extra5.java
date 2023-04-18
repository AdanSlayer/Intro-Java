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
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leyendo = new Scanner(System.in);
        String letra;
        int validacion;
        double costo=0;
        do {
            System.out.println("Ingrese su letra segun su tipo como socio A,B,C: ");
            letra = leyendo.next();
            validacion = String.valueOf(letra).length();
        }while(validacion!=1);
        calcular(letra,costo);
        
    }
    public static void calcular (String letra , double costo){
        Scanner leyendo = new Scanner(System.in);
        switch(letra.toUpperCase()){
            case "A":
                System.out.println("ingrese el costo del tratamiento: ");
                costo = leyendo.nextInt();
                costo = costo * (0.5);
                System.out.println("por ser socio tipo "+letra+" el valor a pagar es: "+costo);
                break;
            case "B":
                System.out.println("ingrese el costo del tratamiento: ");
                costo = leyendo.nextInt();
                costo = costo * (0.65);
                System.out.println("por ser socio tipo "+letra+" el valor a pagar es: "+costo);
                break;
            case "C":
                System.out.println("ingrese el costo del tratamiento: ");
                costo = leyendo.nextInt();
                System.out.println("por ser socio tipo "+letra+" el valor a pagar es: "+costo);
                break;
            default:
                System.out.println("usted no pertenece aqui");
        }
    }
}
    

