package Exc001;

public class averageStock {
    private double minQuant;
    private double maxQuant;

    public double getMaxQuant() {
        return maxQuant;
    }

    public double getMinQuant() {
        return minQuant;
    }

    public void setMaxQuant(double maxQuant) {
        this.maxQuant = maxQuant;
    }

    public void setMinQuant(double minQuant) {
        this.minQuant = minQuant;
    }

    public double calculateAverageStock() {
        double result = this.maxQuant += this.minQuant;
        return result/2;
    }
}
