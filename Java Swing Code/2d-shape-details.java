import java.awt.*;

public class Shape2D {
    private String name;
    private double area;
    private double perimeter;
    private Color color;

    public Shape2D(String name, double area, double perimeter, Color color) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public Color getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
