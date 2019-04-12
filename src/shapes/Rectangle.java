package shapes;

public class Rectangle extends Shape {
    public double width;
    public double height;

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public double getArea() {
        return width * height;
    }
}
