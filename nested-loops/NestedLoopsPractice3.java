import java.util.Scanner;

import javax.naming.directory.AttributeModificationException;
public class NestedLoopsPractice3 {

	public static void main(String[] args) {
		// Display the base-2 system equivalent of a number entered by the user bas-10 system in
		// reverse order.
		
		/*Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the base-10 number :");
		int number = input.nextInt();
		
		for(int i=number;i>0;i=i/2)
		{
			System.out.println(i%2);
		}*/
		
		
		// Display the base-2 system equivalent of a number entered by the user as base-10 system
		// in real order.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the base-10 number :");
		int number = input.nextInt();
		int temp = number;
		int counter = 0;
		
		for(int i=number;i>0;i=i/2) 
		{
			counter++;
		}
		
		for(int i=counter;i>=1;i--)
		{
			for(int j=i;j>1;j--)
			{
				temp=temp/2;
			}
			
			System.out.println(temp%2);
			temp=number;
		}
		
		
	}

}
