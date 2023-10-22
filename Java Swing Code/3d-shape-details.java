import java.awt.*;

public class Shape3D {
    private String name;
    private double volume;
    private double surfaceArea;
    private Color color;

    public Shape3D(String name, double volume, double surfaceArea, Color color) {
        this.name = name;
        this.volume = volume;
        this.surfaceArea = surfaceArea;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public Color getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
