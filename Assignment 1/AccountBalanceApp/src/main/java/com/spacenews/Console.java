import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.next();
    }

    public static double getDouble(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print(prompt);
            sc.next();
        }
        return sc.nextDouble();
    }
}
