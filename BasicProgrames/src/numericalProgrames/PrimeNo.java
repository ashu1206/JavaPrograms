package numericalProgrames;

public class PrimeNo {

	public static void main(String[] args) 
	{
		int i,m = 0,dummy = 0;
		
		int n = 101; 
		
		m = n/2;
		
		if(n==0||n==1)
		{
			System.out.println("Not a Prime Number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("Not a Prime Number");
					
					dummy=1;
					break;
				}
			}
					if(dummy == 0)
					{
						System.out.println("A Prime Number");
					}
				
			}
		}
		
		

	}


