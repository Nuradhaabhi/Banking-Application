import javax.swing.*;
import java.awt.*;

public class HelpPage extends JFrame {
    private JTextArea helpTextArea;

    public HelpPage() {
        setTitle("Help");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        helpTextArea = new JTextArea();
        helpTextArea.setEditable(false);
        helpTextArea.setLineWrap(true);
        helpTextArea.setWrapStyleWord(true);
        helpTextArea.setFont(new Font("Arial", Font.PLAIN, 12));

        JScrollPane scrollPane = new JScrollPane(helpTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(scrollPane, BorderLayout.CENTER);

        setHelpText("This is the help page.\n\nProvide instructions and information about the application here.");

        setVisible(true);
    }

    public void setHelpText(String text) {
        helpTextArea.setText(text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HelpPage::new);
    }
}
