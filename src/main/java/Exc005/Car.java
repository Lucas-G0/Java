package Exc005;

import org.jetbrains.annotations.NotNull;

public class Car {
    private double fuelQt=12;
    private double speed;


    public double getFuelQt() {
        return fuelQt;
    }

    public void setFuelQt(double fuelQt) {
        this.fuelQt = fuelQt;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double calcFuel(@NotNull Trip trip){
        return trip.getDistance()/this.fuelQt;
    }

    public static void print(@NotNull Trip trip, @NotNull Car car){
        System.out.println( "Medium speed: " + car.getSpeed() + "KM/H" +
                "\n Trip time: " + trip.getDuration() + "h" +
                "\n Trip Distance: " + trip.getDistance() + "KM" +
                "\n Car Fuel Spend: " + car.calcFuel(trip) + " liters");
    }
}
