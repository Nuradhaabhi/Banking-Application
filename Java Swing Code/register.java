import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JTextField nameField;
    private JTextField ageField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JTextField lastNameField;
    private JTextField phoneNumberField;

    public RegistrationForm() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();
        panel.add(ageLabel);
        panel.add(ageField);

        JLabel emailLabel = new JLabel("Email ID:");
        emailField = new JTextField();
        panel.add(emailLabel);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField();
        panel.add(lastNameLabel);
        panel.add(lastNameField);

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField();
        panel.add(phoneNumberLabel);
        panel.add(phoneNumberField);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform registration logic here
                String name = nameField.getText();
                String age = ageField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String lastName = lastNameField.getText();
                String phoneNumber = phoneNumberField.getText();

                // Display registered user information
                JOptionPane.showMessageDialog(null, "Registered User Information:\n" +
                        "Name: " + name + "\n" +
                        "Age: " + age + "\n" +
                        "Email ID: " + email + "\n" +
                        "Last Name: " + lastName + "\n" +
                        "Phone Number: " + phoneNumber);
            }
        });
        panel.add(registerButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm();
            }
        });
    }
}
