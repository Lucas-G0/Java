package Exc006_007;

public class Conversor {
    private double celsius;
    private double fahrenheit;

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void celsiusToFahrenheit(){
        this.fahrenheit = (9*this.celsius+160)/5;
    }

    public void fahrenheitToCelsius(){
        this.celsius = (this.fahrenheit-32)*5/9;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
}
