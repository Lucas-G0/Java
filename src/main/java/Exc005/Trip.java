package Exc005;

import org.jetbrains.annotations.NotNull;

public class Trip {
    private double distance;
    private double duration;

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void calcDistance(@NotNull Car car){
        this.setDistance(car.getSpeed()*this.getDuration());
    }
}
