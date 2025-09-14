import java.util.Scanner;
public class ForLoopPractice1 {

	public static void main(String[] args) {
		// Display sum of natural numbers until n entered by the user
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = input.nextInt();
		
		int sum = 0;
		
		for(int i=0;i<=n;i++)
		{
			sum = sum + i;
		}
		
		System.out.printf("%d", sum);
    
	}

}
