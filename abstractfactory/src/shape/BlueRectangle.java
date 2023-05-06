package shape;

public class BlueRectangle extends Rectangle {

    public BlueRectangle(float base) {
        super(base, "BLUE");
    }

    public void draw() {
        System.out.println("Dentro de Retangulo " + getColor() + " de base " + getBase() + " no método draw()");
    }
}
