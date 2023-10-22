import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPage extends JFrame {
    private JButton addUserButton;
    private JButton deleteUserButton;

    public AdminPage() {
        setTitle("Admin Page");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout());

        addUserButton = new JButton("Add User");
        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform add user functionality
                JOptionPane.showMessageDialog(null, "Add User button clicked.");
            }
        });
        contentPane.add(addUserButton);

        deleteUserButton = new JButton("Delete User");
        deleteUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform delete user functionality
                JOptionPane.showMessageDialog(null, "Delete User button clicked.");
            }
        });
        contentPane.add(deleteUserButton);

        setContentPane(contentPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AdminPage::new);
    }
}
