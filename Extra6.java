/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;
/**Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 *
 * @author USER
 */
public class Extra6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el número de personas");
        int n = read.nextInt(),c=0;
        double suma=0,suma2=0,est;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la estatura de la persona "+(i+1));
            est = read.nextDouble();
            suma=suma+est;
            if (est<1.6) {suma2=suma2+est;
                c++;
            }
        }
        System.out.println("El promedio de estaturas es: "+(suma/n));
        System.out.println("El promedio de alturas menores a 1.6 es "+(suma2/c));
    }
}
