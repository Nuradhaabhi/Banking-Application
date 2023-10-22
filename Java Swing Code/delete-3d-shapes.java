import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeManager {
    private List<Shape3D> shapeList;

    public ShapeManager() {
        shapeList = new ArrayList<>();
    }

    public void addShape(Shape3D shape) {
        shapeList.add(shape);
    }

    public void deleteShape(String name) {
        Iterator<Shape3D> iterator = shapeList.iterator();
        while (iterator.hasNext()) {
            Shape3D shape = iterator.next();
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

        // Add sample 3D shapes
        shapeManager.addShape(new Shape3D("Cube", 125, 150, Color.BLUE));
        shapeManager.addShape(new Shape3D("Cylinder", 300, 400, Color.RED));
        shapeManager.addShape(new Shape3D("Sphere", 200, 300, Color.GREEN));

        // Delete a shape by name
        shapeManager.deleteShape("Cube");

        // Delete a shape that doesn't exist
        shapeManager.deleteShape("Pyramid");
    }
}
