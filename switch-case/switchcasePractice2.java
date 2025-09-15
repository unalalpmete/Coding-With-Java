import java.util.Scanner;
public class SwitchCasePractice2 {

	public static void main(String[] args) {
		// Code the program that finds and displays whether a character entered by the user is a 
		// "Vowel" or "Consonant"
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the character :");
		char ch = input.next().charAt(0);
		
		switch(ch) 
		{
		  case 'a' : 
		  case 'e' :
		  case 'i' :
		  case 'o' :
		  case 'u' : System.out.println("Vowel"); break;
		  default : System.out.println("Consonant");
		}

		
		
	}

}
