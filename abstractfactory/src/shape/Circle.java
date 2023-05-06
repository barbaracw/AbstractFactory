package shape;

public abstract class Circle extends Shape {

    private float ray;

    public Circle(float ray, String color) {
        super(color);
        this.ray = ray;
    }

    public float getRay() {
        return ray;
    }

    public void setRay(float ray) {
        this.ray = ray;
    }
}
