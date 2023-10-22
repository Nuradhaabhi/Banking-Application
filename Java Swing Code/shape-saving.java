import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeSavingUI extends JFrame {
    private JTextField shapeNameField;
    private JButton saveButton;

    public ShapeSavingUI() {
        setTitle("Shape Saving");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel shapeNameLabel = new JLabel("Shape Name:");
        shapeNameField = new JTextField();
        panel.add(shapeNameLabel);
        panel.add(shapeNameField);

        saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform saving logic here
                String shapeName = shapeNameField.getText();

                // Perform shape saving operation with the provided name
                // ...
                JOptionPane.showMessageDialog(null, "Shape saved: " + shapeName);

                // Clear input field
                shapeNameField.setText("");
            }
        });
        panel.add(saveButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ShapeSavingUI();
            }
        });
    }
}
