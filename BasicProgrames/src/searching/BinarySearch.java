package searching;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int a[] = {2,3,7,9,10,15,17,20,24,25,26,28,29,31,34,37,39,40};
		
		int srch = 28;
		
		int li = 0;
		
		int hi = a.length-1;
		
		int mi = (li+hi)/2;
		
		while(li <= hi)
		{
			
		if(a[mi] == srch)
		{
			System.out.println("The num is at poisition "+mi+" index position");
			break;
		}
		else if(a[mi] < srch)
		{
		  li = mi+1;	
		}
		else
		{ 
			hi = mi-1;
		}
		mi = (li+hi)/2;
	}
		
		if(li>hi)
		{
			System.out.println("Num not found");
		}
	}

}
