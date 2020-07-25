package numericalProgrames;

import java.util.Scanner;

public class Swapping {
	
	public static void main(String args[]) {
		
		int x,y,temp = 0;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the numbers x and y");
		x = scn.nextInt();
		y=scn.nextInt();
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("Numbers after swapping x = "+x);
		System.out.println("Numbers after swapping y = "+y);
		
		
//		Using third variable
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("Numbers after swapping x = "+x);
		System.out.println("Numbers after swapping y = "+y);
	}

}
