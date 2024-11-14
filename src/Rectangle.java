public class Rectangle implements Resizable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        this.width = width * (1 + percent / 100);
        this.height = height * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Rectangle with width: " + width + ", height: " + height + " and area: " + getArea();
    }
}
