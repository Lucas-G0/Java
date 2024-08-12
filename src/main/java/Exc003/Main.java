package Exc003;

import java.util.Scanner;

/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 *		levando-se em consideração que sua comissão será de 5% do total da venda
 *		e que você tem os seguintes dados:
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida

 *************************************************************************/
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Sale sale = new Sale();
        Seller seller = new Seller();
        Product product = new Product();

        System.out.println("Comission Calculator\n");

        System.out.println("Report seller ID: \n");
        seller.setID(sc.nextInt());

        System.out.println("Report product id: \n");
        product.setProductId(sc.nextInt());

        product.setProductPrice(10);

        System.out.println("Report quantity buyed: \n");
        sale.setQuantity(sc.nextInt());

        seller.setComission(5);

        System.out.println("The comission for this sale is: " + sale.calcComission(product.productPrice, sale.getQuantity(), seller));
    }
}
