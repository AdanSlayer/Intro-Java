package guia7_ex6;

import java.util.Scanner;

public class Guia7_Ex6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese el primer valor");
        num1 = read.nextInt();
        System.out.println("Ingrese el segundo valor");
        num2 = read.nextInt();

        if (num1 > 25 || num2 > 25) {
            System.out.println("Alguno de los valores es mayor a 25");
        } else {
            System.out.println("Ninguno de los valores es mayor a 25");
        }

    }

}
