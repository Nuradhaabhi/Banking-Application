import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create a new 2D shape
        Shape2D shape = new Shape2D("Rectangle", 20.0, 18.0, Color.BLUE);

        // Get the shape details
        String name = shape.getName();
        double area = shape.getArea();
        double perimeter = shape.getPerimeter();
        Color color = shape.getColor();

        // Print the shape details
        System.out.println("Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Color: " + color);
    }
}
