package shape;

public abstract class Rectangle extends Shape {

    private float base;

    public Rectangle(float base, String color) {
        super(color);
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}
