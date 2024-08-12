package Exc004;

import java.util.Scanner;

/*************************************************************************
 * 4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
 * 	valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
 * 	A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
 * 	com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
 * 	devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
 * 	multiplicações.

 *************************************************************************/

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Values values = new Values();
        System.out.println("4 numbers distribuctive sum and multiplication\n");


        System.out.println("Insert values: \n");
        values.setValues(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()});

        values.setValuesSum(values.calcValuesSum());
//        values.setValuesMult(values.calcValuesMult());

        for (int i=0; i<5; i++){
            System.out.println("Sum: " + values.getValuesSum(i) + "\t");
//            System.out.println("Mult: " + values.getValuesMult(i) + "\t");
        }
    }
}
