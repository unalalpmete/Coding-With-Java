import java.util.Scanner;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the nubmer: ");
        int number = input.nextInt();

        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10;  // last digit
            temp = temp / 10;  
        }

        System.out.println(number + " sum of digits: " + sum);
    }
}
