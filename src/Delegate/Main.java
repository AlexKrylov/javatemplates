package Delegate;

public class Main {
    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.setGraphics(new Circle());
        painter.draw();
    }
}
