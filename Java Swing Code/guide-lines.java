import javax.swing.*;
import java.awt.*;

public class GuidelinesPage extends JFrame {
    private JTextArea guidelinesTextArea;

    public GuidelinesPage() {
        setTitle("Guidelines");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        guidelinesTextArea = new JTextArea();
        guidelinesTextArea.setEditable(false);
        guidelinesTextArea.setLineWrap(true);
        guidelinesTextArea.setWrapStyleWord(true);
        guidelinesTextArea.setFont(new Font("Arial", Font.PLAIN, 12));

        JScrollPane scrollPane = new JScrollPane(guidelinesTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(scrollPane, BorderLayout.CENTER);

        setGuidelinesText("Guidelines:\n\n- Use the 'Create New Shape' button to create a new shape.\n- Provide the dimensions of the shape in the specified fields.\n- Visualize the shape in 2D and 3D using the respective buttons.\n- Scale the shape using the scaling options.\n- Add shade to the shape by selecting the shade effect.\n- Change the color of the shape by selecting the color option.\n- Save the shape for future reference.\n- Edit or delete existing shapes using the shape library.\n- Refer to the Help page for more detailed instructions.");

        setVisible(true);
    }

    public void setGuidelinesText(String text) {
        guidelinesTextArea.setText(text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GuidelinesPage::new);
    }
}
