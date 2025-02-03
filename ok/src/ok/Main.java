package ok;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Predefined username and password
        final String USERNAME = "shaan";
        final String PASSWORD = "password123";

        Scanner scanner = new Scanner(System.in);

        // Prompting user for username and password
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Checking credentials
        if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
