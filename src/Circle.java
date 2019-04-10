public class Circle extends Shape {
    public double radius;

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
