import java.util.Scanner;

public class ifelsePractice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Sum even numbers and print numbers divisible by 5 from 1 to n
      
        System.out.print("Enter a number (n): ");
        int n = input.nextInt();

        int sumEven = 0; // inital value of sum

        System.out.println("Numbers divisible by 5 between 1 and " + n + ":");

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                sumEven += i; 
            }

            // number is divisible by 5 ?
            if (i % 5 == 0) {
                System.out.print(i + " "); 
            }
        }

        System.out.println("\nSum of even numbers: " + sumEven);
    }
}
