import java.util.Scanner;
public class IfElsePractice3 {

	public static void main(String[] args) {
		// Code the program that find and displays whether a character entered by the user is a 
		// "Vowel" or "Consonant"
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character :");
		char ch = input.next().charAt(0); 
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
		
		

	}

}
