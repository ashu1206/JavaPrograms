package numericalProgrames;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		int n;
		int a,t;
		int s =0;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the Number = ");		
		n = sc.nextInt();
		
		t = n;
		
		
		while(n>0)
		{
			a = n%10;
			
			n = n/10;
			
			s = s*10 + a;
		}
		
		if(t==s)
		{
			System.out.println("Number is Palindrome");
		}
		else 
		{
		  System.out.println("Number is not a palindrome");	
		}
		

	}

}
