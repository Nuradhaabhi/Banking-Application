import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelectionUI extends JFrame {
    private JButton selectColorButton;

    public ColorSelectionUI() {
        setTitle("Color Selection");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        selectColorButton = new JButton("Select Color");
        selectColorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform color selection logic here
                Color selectedColor = JColorChooser.showDialog(null, "Select Color", Color.WHITE);

                if (selectedColor != null) {
                    // Perform operation with the selected color
                    // ...
                    JOptionPane.showMessageDialog(null, "Color selected: " + selectedColor.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No color selected.");
                }
            }
        });
        panel.add(selectColorButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ColorSelectionUI();
            }
        });
    }
}
