import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        boolean validInput;

        do {
            validInput = true;

            System.out.print("Enter temperature in Celsius: ");

            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            } else {
                validInput = false;
                System.out.println("Invalid input. Please enter a number ");
                scanner.next();
            }

        } while (!validInput);

        scanner.close();
    }
}
