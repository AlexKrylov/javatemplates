package BuilderAbstract;

public class Director {
    CarBuilder carBuilder;
    void setBulder(CarBuilder carb) {
        carBuilder = carb;
    }

    Car buidCar() {
        carBuilder.createCar();
        carBuilder.buildMake();
        carBuilder.buildTransmission();
        carBuilder.buildSpeed();
        Car car = carBuilder.getCar();
        return car;
    }
}
