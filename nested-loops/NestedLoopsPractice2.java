import java.util.Scanner;
public class NestedLoopsPractice2 {

	public static void main(String[] args) {
		// Display odd natural numbers from 1 to 99 as 5 numbers per line ny using for statement
		
		
		for(int i=0;i<100;i=i+10)
		{
			for(int j=1;j<10;j=j+2)
			{
				System.out.printf("%5d", i+j);
			}
			System.out.printf("\n");
		}
		

	}

}
