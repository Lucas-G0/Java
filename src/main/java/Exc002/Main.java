package Exc002;

import java.util.Scanner;

/*************************************************************************
 *  2) Faça um programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Real to Dolar Conversor\n");

        System.out.println("Report value in real: ");
        double realQty = sc.nextDouble();

        double dolarCote = 5.14;

        System.out.println("\n" + realQty + "R$ = " + conversion(realQty, dolarCote) + "$");
    }

    public static double conversion(double realQty, double dolarCote){
        return realQty*dolarCote;
    }
}
