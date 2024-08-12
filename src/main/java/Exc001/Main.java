package Exc001;

import java.util.Scanner;

/*************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *
 *************************************************************************/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        averageStock avg = new averageStock();

        System.out.println("Average Stock Calculator\n");

        System.out.println("Report minimum quantity: ");
        avg.setMinQuant(sc.nextDouble());

        System.out.println("\nReport maximum quantity: ");
        avg.setMaxQuant(sc.nextDouble());

        System.out.println("\nAverage stock quantity is: " + avg.calculateAverageStock());
    }
}