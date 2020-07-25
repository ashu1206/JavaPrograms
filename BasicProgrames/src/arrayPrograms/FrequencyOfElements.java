package arrayPrograms;

public class FrequencyOfElements {

	public static void main(String[] args) 
	{
		int i,j;
		
		int a[] = {2,5,6,1,3,4,5,7,6,2,3,5,4,6,7,9,8,5,4,8};
		
		int b[] = new int[a.length];
		
		int visited = -1;
		
		for(i=0;i<a.length;i++)
		{
			int count = 1;
			
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=visited;
				}
			}
			if(b[i]!=visited)
			{
				b[i]=count;
			}
		}
		System.out.println("-------------------");
		System.out.println("Element | Frequency");
		System.out.println("-------------------");
		
		for(i=0;i<b.length;i++)
		{
			if(b[i]!=visited)
			{
				System.out.println( "   "+a[i]+"          "+b[i]);
			}
		}
		System.out.println("-------------------");
		

	}

}
