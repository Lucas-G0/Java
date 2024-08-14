package Exc006_007;

import java.util.Scanner;

/*****************************************************************************************************************
 * 6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
 * 	temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
 * 	Fahrenheit e a variável C representa é a temperatura em graus Celsius.
 * 7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
 * 		temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
 * 		variável C é a temperatura em graus Celsius.

 *****************************************************************************************************************/
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("Celsius and Fahrenheit Conversor\n1-Celsius to Fahrenheit: \n2-Fahrenheit to Celsius: ");
        int option = sc.nextInt();

        if (option == 1){
            System.out.println("Enter the temperature in Celsius: ");
            conversor.setCelsius(sc.nextDouble());
            conversor.celsiusToFahrenheit();
        } else if (option == 2){
            System.out.println("Enter the temperature in Fahrenheit: ");
            conversor.setFahrenheit(sc.nextDouble());
            conversor.fahrenheitToCelsius();
        }
        System.out.println(conversor.getCelsius()+"°C = " + conversor.getFahrenheit() + "°F");
    }
}
