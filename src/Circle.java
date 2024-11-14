public class Circle implements Resizable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        this.radius = radius * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius + " and area: " + getArea();
    }

}
