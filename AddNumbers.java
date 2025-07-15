import java.util.Scanner;
public class AddNumbers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        char userinput;

        do {
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.print("Do you want to continue? (y/n): ");
            userinput = input.next().charAt(0);

        } while (userinput == 'y' || userinput == 'Y');

        System.out.println("The End.");
    }
}