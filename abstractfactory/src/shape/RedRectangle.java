package shape;

public class RedRectangle extends Rectangle {

    public RedRectangle(float base) {
        super(base, "RED");
    }

    public void draw() {
        System.out.println("Dentro de Retangulo " + getColor() + " de base " + getBase() + " no método draw()");
    }
}
