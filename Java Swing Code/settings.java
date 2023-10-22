import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsPage extends JFrame {
    private JCheckBox darkModeCheckBox;
    private JButton saveButton;

    public SettingsPage() {
        setTitle("Settings");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        darkModeCheckBox = new JCheckBox("Enable Dark Mode");
        contentPane.add(darkModeCheckBox, BorderLayout.CENTER);

        saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveSettings();
            }
        });
        contentPane.add(saveButton, BorderLayout.SOUTH);

        setContentPane(contentPane);
        setVisible(true);
    }

    private void saveSettings() {
        boolean isDarkModeEnabled = darkModeCheckBox.isSelected();
        // Save the settings here
        System.out.println("Settings saved: Dark Mode = " + isDarkModeEnabled);
        dispose(); // Close the settings page after saving
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SettingsPage::new);
    }
}
