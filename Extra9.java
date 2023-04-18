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
public class Extra9 {
    public static void main(String[] args) {
        // TODO code application logic here
        /*Simular la división usando solamente restas. Dados dos números enteros 
        mayores que uno, realizar un algoritmo que calcule el cociente y el 
        residuo usando sólo restas. Método: Restar el dividendo del divisor 
        hasta obtener un resultado menor que el divisor, este resultado 
        es el residuo, y el número de restas realizadas es el cociente. 
        Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas

        50

        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
        3. ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
        Scanner leer = new Scanner(System.in);
        int dividendo = 50;
        int divisor = 13;
        int cociente = 0;

        while (dividendo > divisor) {
            System.out.println(dividendo + " - " + divisor + " = " + (dividendo - divisor));
            dividendo = dividendo - divisor;
            cociente++;
        }
        System.out.println("El residuo es igual a: " + dividendo);
        System.out.println("El cociente es igual a: " + cociente);
    }

}
