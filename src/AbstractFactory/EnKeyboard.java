package AbstractFactory;

public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Writing");
    }

    @Override
    public void println() {
        System.out.println("Writing with line break");
    }
}
