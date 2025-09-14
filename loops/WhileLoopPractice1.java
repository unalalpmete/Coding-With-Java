import java.util.Scanner;
public class WhileLoopPractice1 {

	public static void main(String[] args) {
		// Display sum of natural numbers until n entered by the users.
		
		Scanner input = new Scanner(System.in);
		
		int i=1;
		System.out.println("Please enter a number :");
		int n = input.nextInt();
		
		while(n!=0)
		{
			int sum=0;
			i=1;
			
			
			while(i<=n)
			{
				sum=sum + i++;
			}
			
			System.out.println(sum);
			System.out.println("please enter a number :");
			n = input.nextInt();
		}
		
		

	}

}
