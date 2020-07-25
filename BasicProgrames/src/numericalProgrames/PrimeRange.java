package numericalProgrames;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in); 
		  
	       System.out.print("Enter the first number : ");  
	       
	       int first = sc.nextInt();  
	       
	       System.out.print("Enter the second number : "); 
	       
	       int second = sc.nextInt();  
	       
	       System.out.println("List of prime numbers between " + first + " and " + second);  
	       
	       for (int i = first; i <= second; i++) 
	       {  
	           if (isPrime(i)) 
	           {  
	               System.out.print(" "+i);  
	           }  
	       }  
	   }  
	   public static boolean isPrime(int n)
	   {  
	       if (n <= 1)
	       {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++)
	       {  
	           if (n % i == 0)
	           {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  

	}


