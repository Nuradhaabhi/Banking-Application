import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeManager {
    private List<Shape2D> shapeList;

    public ShapeManager() {
        shapeList = new ArrayList<>();
    }

    public void addShape(Shape2D shape) {
        shapeList.add(shape);
    }

    public void deleteShape(String name) {
        Iterator<Shape2D> iterator = shapeList.iterator();
        while (iterator.hasNext()) {
            Shape2D shape = iterator.next();
            if (shape.getName().equals(name)) {
                iterator.remove();
                System.out.println("Shape deleted: " + shape.getName());
                return; // Exit the method after deleting the shape
            }
        }
        System.out.println("Shape not found: " + name);
    }

    // Other methods for shape management...

    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();

        // Add sample 2D shapes
        shapeManager.addShape(new Shape2D("Rectangle", 40, 18, Color.BLUE));
        shapeManager.addShape(new Shape2D("Circle", 50, 31.42, Color.RED));
        shapeManager.addShape(new Shape2D("Triangle", 12, 15, Color.GREEN));

        // Delete a shape by name
        shapeManager.deleteShape("Rectangle");

        // Delete a shape that doesn't exist
        shapeManager.deleteShape("Hexagon");
    }
}
