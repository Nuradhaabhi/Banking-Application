public class Main {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("John", 30, "john@example.com", "password123", "Doe", "1234567890");

        // Get profile details
        String name = userProfile.getName();
        int age = userProfile.getAge();
        String email = userProfile.getEmail();
        String password = userProfile.getPassword();
        String lastName = userProfile.getLastName();
        String phoneNumber = userProfile.getPhoneNumber();

        // Print profile details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Last Name: " + lastName);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
