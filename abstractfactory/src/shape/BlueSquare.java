package shape;

public class BlueSquare extends Square {

    public BlueSquare(float height) {
        super(height, "BLUE");
    }

    public void draw() {
        System.out.println("Dentro de Quadrado " + getColor() + " de altura " + getHeight() + " no método draw()");
    }
}
