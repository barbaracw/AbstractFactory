package shape;

public class RedSquare extends Square {

    public RedSquare(float height) {
        super(height, "RED");
    }

    public void draw() {
        System.out.println("Dentro de Quadrado " + getColor() + " de altura " + getHeight() + " no método draw()");
    }
}
