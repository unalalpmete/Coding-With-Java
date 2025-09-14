import java.util.Scanner;

public class ForLoopPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int sum = 0;

        // sum of digits of a number
        for (; number > 0; number = number / 10) {
            int digit = number % 10; // last digit
            sum += digit;
        }

        System.out.println("Sum of Digits: " + sum);
    }
}
