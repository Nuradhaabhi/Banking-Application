import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JWindow {
    private int duration; // Duration in milliseconds to display the splash screen

    public SplashScreen(int duration) {
        this.duration = duration;
    }

    public void showSplash() {
        JPanel content = (JPanel) getContentPane();
        content.setBackground(Color.WHITE);

        // Set the size and position of the splash screen
        int width = 500;
        int height = 300;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);

        // Create the splash screen's content
        JLabel label = new JLabel(new ImageIcon("splash_logo.png")); // Replace "splash_logo.png" with your actual logo file path
        content.add(label, BorderLayout.CENTER);

        // Display the splash screen
        setVisible(true);

        // Pause for the specified duration
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the splash screen
        setVisible(false);
    }

    public static void main(String[] args) {
        // Create an instance of the SplashScreen class
        SplashScreen splashScreen = new SplashScreen(3000); // Specify the duration in milliseconds (e.g., 3000 = 3 seconds)

        // Show the splash screen
        splashScreen.showSplash();

        // Perform any additional initialization or startup tasks for the Shape Master application
        // ...
    }
}
