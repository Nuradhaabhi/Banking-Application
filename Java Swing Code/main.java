import javax.swing.*;

public class ShapeMasterApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create and display the login page
                LoginPage loginPage = new LoginPage();

                // Example usage: check login credentials and open the dashboard
                loginPage.setLoginListener(new LoginListener() {
                    public void onLogin(String email, String password) {
                        // Perform login verification here

                        // If login is successful, close the login page and open the dashboard
                        loginPage.dispose();
                        DashboardPage dashboardPage = new DashboardPage();
                        // Add any additional initialization or configuration for the dashboard

                        // Example usage: open the dashboard with the user's profile
                        dashboardPage.setUserProfile(email);
                    }
                });
            }
        });
    }
}
