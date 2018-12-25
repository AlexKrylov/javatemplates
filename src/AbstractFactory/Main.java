package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = getDeviceFactory("EN");
        Keyboard keyboard = deviceFactory.getKeyboard();
        keyboard.print();


    }

    private static DeviceFactory getDeviceFactory(String language) {
        switch (language) {
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Country code: " + language);
        }
    }
}
