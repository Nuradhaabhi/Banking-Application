import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeMasterDashboard extends JFrame {
    public ShapeMasterDashboard() {
        setTitle("Shape Master Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Welcome to Shape Master");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        JButton createShapeButton = new JButton("Create Shape");
        createShapeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform action when "Create Shape" button is clicked
                // ...
                JOptionPane.showMessageDialog(null, "Create Shape button clicked.");
            }
        });

        JButton viewShapesButton = new JButton("View Shapes");
        viewShapesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform action when "View Shapes" button is clicked
                // ...
                JOptionPane.showMessageDialog(null, "View Shapes button clicked.");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(createShapeButton);
        buttonPanel.add(viewShapesButton);
        panel.add(buttonPanel, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ShapeMasterDashboard();
            }
        });
    }
}
