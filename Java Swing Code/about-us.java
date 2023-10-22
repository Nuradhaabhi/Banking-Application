import javax.swing.*;
import java.awt.*;

public class AboutUsPage extends JFrame {
    private JTextArea aboutTextArea;

    public AboutUsPage() {
        setTitle("About Us");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        aboutTextArea = new JTextArea();
        aboutTextArea.setEditable(false);
        aboutTextArea.setLineWrap(true);
        aboutTextArea.setWrapStyleWord(true);
        aboutTextArea.setFont(new Font("Arial", Font.PLAIN, 12));

        JScrollPane scrollPane = new JScrollPane(aboutTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(scrollPane, BorderLayout.CENTER);

        setAboutText("Shape Master\n\nVersion 1.0\n\nThis application allows children in primary school to learn about shapes in 2D and 3D format. It provides the fundamentals of how to draw shapes and polygons. Have fun learning!");

        setVisible(true);
    }

    public void setAboutText(String text) {
        aboutTextArea.setText(text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AboutUsPage::new);
    }
}
