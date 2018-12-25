package BuilderAbstract;

import BuilderSimple.Transmission;

public class FordBuilder extends CarBuilder {

    @Override
    void buildMake() {
        car.setMake("Ford");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildSpeed() {
        car.setMaxSpeed(200);
    }
}
