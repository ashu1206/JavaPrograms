package arrayPrograms;

public class TransposeMatrix {

	public static void main(String[] args) 
	{
		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
		
		int t[][] = new int[3][3];
		
		int i,j;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				t[i][j] = a[j][i];
			}
		}
		System.out.println("Original Matrix");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
	}
		System.out.println("Transpose Matrix");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(t[i][j]+" ");
			}
			System.out.println();

		}
	}
}
