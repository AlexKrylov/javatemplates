package BuilderSimple;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMake("Porche")
                .buildTransmission(Transmission.AUTO)
                .buildSpeed(250).build();

        System.out.println(car.toString());
    }
}
