import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        // Scans the username.
        String userName = scanner.nextLine();

        // Scans the year of enrollment.
        int year = scanner.nextInt();

        // Prints message.
        System.out.println("Hello " + userName);
        System.out.println("Free services till:" + (year + 4));
    }
}