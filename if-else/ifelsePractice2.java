import java.util.Scanner;
public class IfElsePractice2 {

	public static void main(String[] args) {
		// Code the program that substracts and displays the smaller number of the two entered
		// numbers from the high number.
		
		Scanner input = new Scanner(System.in);
		
		int number1,number2;
		System.out.println("Enter the number1 and number2 :");
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		if(number1>number2)
		{
			System.out.println(number1-number2);
		}
		else
		{
			System.out.println(number2-number1);
		}
		
		
		
	}

}
