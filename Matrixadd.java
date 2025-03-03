import java.util.*; 
class Matrixadd 
{
	public static void main(String args[])
	{
		int row, col,i,j,k;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		row = in.nextInt();
		System.out.println("Enter the number columns");
		col = in.nextInt();
		int matrix1[][] = new int[row][col];
		int matrix2[][] = new int[row][col];
		int res[][] = new int[row][col];
		int pdt[][] = new int[row][col]; 
		System.out.println("Enter the elements of matrix 1");
		for ( i= 0 ; i < row ; i++ )
		{ 
			for ( j= 0 ; j < col ;j++ )
			matrix1[i][j] = in.nextInt();
			System.out.println();
		}
		System.out.println("Enter the elements of matrix 2");
		for ( i= 0 ; i < row ; i++ )
		{
			for ( j= 0 ; j < col ;j++ )
				matrix2[i][j] = in.nextInt();
			System.out.println();
		}
		for ( i= 0 ; i < row ; i++ )
			for ( j= 0 ; j < col ;j++ )
				res[i][j] = matrix1[i][j] + matrix2[i][j] ; 
		System.out.println("Sum of matrices:-");
		for ( i= 0 ; i < row ; i++ )
		{ 
		for ( j= 0 ; j < col ;j++ )
			System.out.print(res[i][j]+"\t");
		System.out.println();
		}
		System.out.println("product of matrices:-");
		for (i=0; i<row ;i++)
		{
		 for ( j= 0 ; j < col ;j++ )
		 {
		  for (k=0 ; k<col;k++)
		  {
		   pdt[i][j] += matrix1[i][k] * matrix2[k][j];
		  } 
		 }
		}
		System.out.println("Resultant matrices:");
		for ( i= 0 ; i < row ; i++ )
		{ 
		for ( j= 0 ; j < col ;j++ )
			System.out.print(pdt[i][j]+"\t\t");
		System.out.println();
		}
	}
}
