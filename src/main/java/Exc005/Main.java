package Exc005;

import java.util.Scanner;

import static Exc005.Car.print;

/*****************************************************************************************************************
 * 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
 * 	12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
 * 	Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
 * 	Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
 * 	fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
 * 	tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
 *****************************************************************************************************************/

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        car.setFuelQt(12);
        System.out.println("Report medium speed: \n");
        car.setSpeed(sc.nextDouble());

        Trip trip = new Trip();
        System.out.println("Report trip time: \n");
        trip.setDuration(sc.nextDouble());

        trip.calcDistance(car);
        car.calcFuel(trip);

        print(trip, car);

    }
}
