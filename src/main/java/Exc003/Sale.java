package Exc003;

import org.jetbrains.annotations.NotNull;

public class Sale extends Product {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calcComission(double productPrice, int quantity, @NotNull Seller seller){
        double total = productPrice * quantity;
        total += (seller.getComission()/100)*total;
        return total;
    }
}
