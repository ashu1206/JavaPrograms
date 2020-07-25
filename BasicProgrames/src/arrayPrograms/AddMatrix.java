package arrayPrograms;

public class AddMatrix {

	public static void main(String[] args) 
	{
		int a[][] = {{2,9,4},{5,17,1},{8,11,6}};
		
		int b[][] = {{6,7,3},{4,8,12},{2,6,10}};
		
		int c[][] = new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
