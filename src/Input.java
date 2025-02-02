import java.util.Scanner;
public class Input {
    public static void main(String[] args) {

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Collecting user information
        String userName;
        System.out.print("What is your name? ");
        userName = scanner.nextLine();

        int userAge;
        System.out.print("What is your age? ");
        userAge = scanner.nextInt();

        float userWeight;
        System.out.print("What is your weight? ");
        userWeight = scanner.nextFloat();
        
        boolean ifSmoker;
        System.out.print("Do you smoke? (true or false) ");
        ifSmoker = scanner.nextBoolean();

        // Output information back to the user
        System.out.println("Name: " + userName);
        System.out.println("Age: " + userAge);
        System.out.println("Weight: " + userWeight);
        System.out.println("Smokes: " + ifSmoker);
    }
}