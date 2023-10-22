import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShadeEffectUI extends JFrame {
    private JButton addShadeButton;

    public ShadeEffectUI() {
        setTitle("Add Shade Effect");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        addShadeButton = new JButton("Add Shade");
        addShadeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform shade effect logic here

                // Perform shade effect operation on the shape
                // ...

                JOptionPane.showMessageDialog(null, "Shade effect added to the shape.");

                // Clear input field
                // ...
            }
        });
        panel.add(addShadeButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ShadeEffectUI();
            }
        });
    }
}
