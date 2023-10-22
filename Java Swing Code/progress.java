import javax.swing.*;
import java.awt.*;

public class ProgressPage extends JFrame {
    private JProgressBar progressBar;

    public ProgressPage() {
        setTitle("Progress");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 100);
        setLocationRelativeTo(null);

        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(progressBar, BorderLayout.CENTER);

        setContentPane(contentPane);

        setVisible(true);
    }

    public void setProgress(int value) {
        progressBar.setValue(value);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProgressPage progressPage = new ProgressPage();

            // Example usage: incrementing the progress value
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(100); // Simulating task delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progressPage.setProgress(i);
            }
        });
    }
}
