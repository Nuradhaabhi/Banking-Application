import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeScalingUI extends JFrame {
    private JTextField scalingFactorField;
    private JButton scaleButton;

    public ShapeScalingUI() {
        setTitle("Shape Scaling");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel scalingFactorLabel = new JLabel("Scaling Factor:");
        scalingFactorField = new JTextField();
        panel.add(scalingFactorLabel);
        panel.add(scalingFactorField);

        scaleButton = new JButton("Scale");
        scaleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform scaling logic here
                String scalingFactorText = scalingFactorField.getText();
                try {
                    double scalingFactor = Double.parseDouble(scalingFactorText);

                    // Perform scaling operation with the provided factor
                    // ...
                    JOptionPane.showMessageDialog(null, "Shape scaled by factor: " + scalingFactor);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid scaling factor. Please enter a numeric value.");
                }

                // Clear input field
                scalingFactorField.setText("");
            }
        });
        panel.add(scaleButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ShapeScalingUI();
            }
        });
    }
}
