package BuilderSimple;

public class CarBuilder {
    String m = "Default";
    Transmission tr = Transmission.MANUAL;
    int speed = 200;

    CarBuilder buildMake(String m) {
        this.m = m;
        return this;
    }

    CarBuilder buildTransmission(Transmission tr) {
        this.tr = tr;
        return this;
    }

    CarBuilder buildSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setMake(m);
        car.setTransmission(tr);
        car.setMaxSpeed(speed);
        return car;
    }
}
