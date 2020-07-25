package searching;

public class LinearStringSearch {

	public static void main(String[] args) 
	{
		
		int  i;
		
		String a[] = {"rahul","anmol","roshan","ashu","abhi","krish"};
		
		int n = a.length;
		
		String word = "abhi";
		
		int temp =0;
		
		for(i=0;i<n;i++)
		{
			if(a[i].equals(word))
			{
				System.out.println("The word is at position "+i+" index position");
				
				temp = temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Word is not found in the list");
		}

	}
	

}
