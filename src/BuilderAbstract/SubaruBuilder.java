package BuilderAbstract;

import BuilderSimple.Transmission;

public class SubaruBuilder extends CarBuilder {
    @Override
    void buildMake() {
        car.setMake("Subaru");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildSpeed() {
        car.setMaxSpeed(340);
    }
}
