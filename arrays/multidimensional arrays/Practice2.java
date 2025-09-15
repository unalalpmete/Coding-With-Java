import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		// Read a 3x3 matrix and calculate the sum of elements

		Scanner input =  new Scanner(System.in);
		
		int[][] matrix = new int[3][3];
		int sum = 0;
		
		System.out.println("Enter the 9 numbers :");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				matrix[i][j] = input.nextInt();
				sum = sum + matrix[i][j];
			}
		}
		
		// printing the matrix
		System.out.println("The Matrix :");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(matrix[i][j] + " ");
			}
		}
		
		System.out.println("Sum of elements : " + sum);
		
	}

}
