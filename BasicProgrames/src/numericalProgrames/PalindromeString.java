package numericalProgrames;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) 
	{
		String initial , reverse = "";
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the String = ");		
		initial = sc.nextLine();
		
		int length = initial.length();
		
		for(int i=length-1; i>=0;i--)
		{
			reverse = reverse + initial.charAt(i);
		}
		
			
		if(initial.equals(reverse))
		{
			System.out.println("String is Palindrome");
		}
		else 
		{
		  System.out.println("String is not a palindrome");	
		}
		

	}

}
