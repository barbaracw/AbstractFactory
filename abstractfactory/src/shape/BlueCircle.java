package shape;

public class BlueCircle extends Circle {

    public BlueCircle(float ray) {
        super(ray, "BLUE");
    }

    public void draw() {
        System.out.println("Dentro de Circulo " + getColor() + " de raio " + getRay() + " no método draw()");
    }
}
