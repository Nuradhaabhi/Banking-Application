import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create a new 3D shape
        Shape3D shape = new Shape3D("Sphere", 113.097, 452.389, Color.RED);

        // Get the shape details
        String name = shape.getName();
        double volume = shape.getVolume();
        double surfaceArea = shape.getSurfaceArea();
        Color color = shape.getColor();

        // Print the shape details
        System.out.println("Name: " + name);
        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Color: " + color);
    }
}
