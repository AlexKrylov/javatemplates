package BuilderAbstract;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBulder(new FordBuilder());
        Car car = director.buidCar();
        System.out.println(car);
    }
}
