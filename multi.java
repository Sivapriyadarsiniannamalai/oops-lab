import java.util.*;
public class palindrome
{
public static void main(String[]args)
{
int a[][]=new int[10][10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers of rows of matrix 1");
int r=sc.nextLine();
System.out.println("Enter the numbers of columns of matrix 1");
int c=sc.nextLine();
System.out.println("Enter the numbers of rows of matrix 2");
int r=sc.nextLine();
System.out.println("Enter the numbers of columns of matrix 2");
int c=sc.nextLine();
if (cols1!=rows2)
{
System.out.println(" number of cols of matrix 1 should be equal to number of rows of matrix 2");
return
}
int[][]matrix1=new int[rows1][cols1];
int[][]matrix2=new int[rows2][cols2];
int[][]result =new int[row1][cols2];
System.out.println("Enter the elements matrix 1");
for (int i=0;i<rows1;i++)
{
for (int j=0;j< cols1;j++)
{
System.out.println("element["+(i+1)+"]["+(j+1)+"]:");
matrix1[i][j]=sc.nextInt();
}
}
System.out.println("Enter the elements of matrix 2");exam@mcet-desktop:~$ 

for (int i=0;i<rows2;i++)
{
for (int j=0;j< cols2;j++)
{
System.out.println("element["+(i+1)+"]["+(j+1)+"]:");
matrix2[i][j]=sc.nextInt();
}
}
for (int i=0;i<rows1;i++)
{
for (int j=0;j<cols2;j++)
{
result[i][j]=0;
for(int k=0;k<cols1;k++)
{
result[i][j]+=matrix1[i][k]* matrix2[k][j];
System.out.println(" the result of the matrix multiplication is ");
}
sc.close();
}
}
}

}


