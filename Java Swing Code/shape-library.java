import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeLibraryUI extends JFrame {
    private JTextArea shapeListArea;
    private JButton refreshButton;

    public ShapeLibraryUI() {
        setTitle("Shape Library");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        shapeListArea = new JTextArea();
        shapeListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(shapeListArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform refresh logic here
                refreshShapeList();
            }
        });
        panel.add(refreshButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    private void refreshShapeList() {
        // Retrieve the shape library data
        // ...
        String shapeLibraryData = getShapeLibraryData();

        // Display the shape library data in the UI
        shapeListArea.setText(shapeLibraryData);
    }

    private String getShapeLibraryData() {
        // Retrieve the shape library data from your storage or data source
        // ...
        return "Shape 1\nShape 2\nShape 3"; // Sample data for demonstration
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ShapeLibraryUI();
            }
        });
    }
}
