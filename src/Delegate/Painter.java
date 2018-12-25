package Delegate;

public class Painter {
    Graphics graphics;
    void setGraphics (Graphics graph) {
        graphics = graph;
    }

    void draw() {
        graphics.draw();
    }
}
