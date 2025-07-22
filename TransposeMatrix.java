import java.util.*;
class TransposeMatrix
{
public static void main(String args[])
{
	int a[][];
	int r,c,i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("How many Rows : ");
	r = sc.nextInt();
	System.out.println("How many Columns : ");
	c = sc.nextInt();

	a = new int[r][c];

	System.out.println("Enter the Matrix elements : ");
	for(i = 0; i<r; i++)
	{
		for(j=0;j<c;j++)
		a[i][j] = sc.nextInt();
	}

	System.out.println("Matrix elements are : ");
	for(i = 0; i<r; i++)
	{
		for(j=0;j<c;j++)
		     System.out.print(a[i][j] + "\t");
		System.out.println();
	}
	
	System.out.println("Matrix Transpose is : ");
	for(i = 0; i<c; i++)
	{
		for(j=0;j<r;j++)
		     System.out.print(a[j][i] + "\t");
		System.out.println();
	}



}
}
