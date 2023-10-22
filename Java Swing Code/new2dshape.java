import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateShapeUI extends JFrame {
    private JTextField nameField;
    private JComboBox<String> shapeTypeComboBox;
    private JButton createButton;

    public CreateShapeUI() {
        setTitle("Create New 2D Shape");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel nameLabel = new JLabel("Shape Name:");
        nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel shapeTypeLabel = new JLabel("Shape Type:");
        String[] shapeTypes = {"Circle", "Rectangle", "Triangle"};
        shapeTypeComboBox = new JComboBox<>(shapeTypes);
        panel.add(shapeTypeLabel);
        panel.add(shapeTypeComboBox);

        createButton = new JButton("Create");
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform create shape logic here
                String shapeName = nameField.getText();
                String selectedShapeType = (String) shapeTypeComboBox.getSelectedItem();

                // Create the shape object based on the selected shape type
                Shape shape = null;
                if (selectedShapeType.equals("Circle")) {
                    shape = new Circle();
                } else if (selectedShapeType.equals("Rectangle")) {
                    shape = new Rectangle();
                } else if (selectedShapeType.equals("Triangle")) {
                    shape = new Triangle();
                }

                // Further process the created shape, such as saving or displaying it
                if (shape != null) {
                    shape.setName(shapeName);
                    // Perform additional actions with the created shape
                    // ...
                    JOptionPane.showMessageDialog(null, "Shape created:\n" + shape.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Error creating shape.");
                }

                // Clear input fields
                nameField.setText("");
                shapeTypeComboBox.setSelectedIndex(0);
            }
        });
        panel.add(createButton);

        add(panel);
        setVisible(true);
    }

    // Example shape classes (can be expanded with additional properties and methods)
    private abstract class Shape {
        protected String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Name: " + name;
        }
    }

    private class Circle extends Shape {
        // Additional properties and methods specific to Circle shape
    }

    private class Rectangle extends Shape {
        // Additional properties and methods specific to Rectangle shape
    }

    private class Triangle extends Shape {
        // Additional properties and methods specific to Triangle shape
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CreateShapeUI();
            }
        });
    }
}
