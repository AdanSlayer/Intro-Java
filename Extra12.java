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
public class Extra12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int u = 0, d = 0, c = 0;
        for (int i = 0; i < 1000; i++) {
            System.out.println((c + "").replace("3", "E") + "-" +
                    (d + "").replace("3", "E") + "-" + (u + "").replace("3", "E"));
            u++;
            if (u > 9) {
                u = 0;
                d++;
            }
            if (d > 9) {
                d = 0;
                c++;
            }
        }
    }
}
//String con1, con2, cont3;
//        
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                for (int k = 0; k < 10; k++) {
//                    con1 = String.valueOf(i);
//                    con2 = String.valueOf(j);
//                    cont3 = String.valueOf(k);
//                    switch (i) {
//                        case 3 -> con1 = "E";
//                    }
//                    switch (j) {
//                        case 3 -> con2 = "E";
//                    }
//                    switch (k) {
//                        case 3 -> cont3 = "E";
//                    }
//                    System.out.print("[" + con1 + " - " + con2 + " - " + cont3 + "]");
//                }
//                System.out.println("");
//            }
//            System.out.println("");
