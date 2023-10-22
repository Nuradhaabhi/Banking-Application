import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Create3DShapeUI extends JFrame {
    private JTextField nameField;
    private JComboBox<String> shapeTypeComboBox;
    private JButton createButton;

    public Create3DShapeUI() {
        setTitle("Create New 3D Shape");
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
        String[] shapeTypes = {"Sphere", "Cube", "Cylinder"};
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
                Shape3D shape = null;
                if (selectedShapeType.equals("Sphere")) {
                    shape = new Sphere();
                } else if (selectedShapeType.equals("Cube")) {
                    shape = new Cube();
                } else if (selectedShapeType.equals("Cylinder")) {
                    shape = new Cylinder();
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
    private abstract class Shape3D {
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

    private class Sphere extends Shape3D {
        // Additional properties and methods specific to Sphere shape
    }

    private class Cube extends Shape3D {
        // Additional properties and methods specific to Cube shape
    }

    private class Cylinder extends Shape3D {
        // Additional properties and methods specific to Cylinder shape
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Create3DShapeUI();
            }
        });
    }
}
