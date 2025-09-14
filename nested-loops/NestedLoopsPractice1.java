import java.util.Scanner;
public class NestedLoopsPractice1 {

	public static void main(String[] args) {
		// Display all natural number from 1 to 100 as 10 numbers per line by using for statement
		
		
		for(int i=0;i<100;i=i+10)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.printf("%d\t", i+j);
			}
			System.out.printf("\n");
		}
		
	}

}
