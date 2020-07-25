package arrayPrograms;

public class CopyArray {

	public static void main(String[] args) 
	{
		int a[] = {2,5,1,0,6,8};
		
		int b[] =  new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
		
		}
		System.out.println("Elements of Original array are");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Elements of Copied array are ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
