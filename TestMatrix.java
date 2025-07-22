import java.util.*;
class Matrix
{
	private int a[][];
	private int r,c;
	static Scanner sc = new Scanner(System.in);
	public void input()
	{
		System.out.println("How many Rows : ");
		r = sc.nextInt();
		System.out.println("How many Columns : ");
		c = sc.nextInt();

		a = new int[r][c];

		System.out.println("Enter the Matrix elements : ");
		for(int i = 0; i<r; i++)
		{
			for(int j=0;j<c;j++)
			a[i][j] = sc.nextInt();
		}
	}
	public void show()	
	{
	System.out.println("Matrix elements are : ");
	for(int i = 0; i<r; i++)
	{
		for(int j=0;j<c;j++)
		     System.out.print(a[i][j] + "\t");
		System.out.println();
	}
	}
	public void transpose()
	{
		System.out.println("Matrix Transpose is : ");
	for(int i = 0; i<c; i++)
	{
		for(int j=0;j<r;j++)
		     System.out.print(a[j][i] + "\t");
		System.out.println();
	}

	}
	public Matrix add(Matrix x)
	{
		Matrix res= new Matrix();
		if(this.r == x.r && this.c == x.c)
		{
			res.r = this.r;
			res.c = this.c;
			res.a = new int[r][c];
			for(int i =0 ;i < this.r; i++)
			{
			for(int j=0; j<this.c;j++)
			res.a[i][j] = this.a[i][j] + x.a[i][j];
			}
		}
		else
			System.out.println("Size not Same- Addition not possible");
		
		return res;
	}
	public Matrix multiply(Matrix x)
	{
		Matrix res = new Matrix();
		if(this.c == x.r )
		{
			res.r = this.r;
			res.c = x.c;
			res.a = new int[r][x.c];
			for(int i =0 ;i < this.r; i++)
			{
			for(int j=0; j<x.c;j++)
			{
			res.a[i][j] = 0;
			for(int k = 0; k <this.c; k++)
			res.a[i][j] += this.a[i][k] * x.a[k][j];
			}
			}
		}
		else
			System.out.println("Multiplication not possible");
			
		return res;
	}


}
class TestMatrix
{
public static void main(String args[])
{
	
	
	Matrix m = new Matrix();
	m.input();
	m.show();
	//m.transpose();
	Matrix n = new Matrix();
	n.input();
	n.show();
	Matrix r;
	r = m.multiply(n);
	r.show();


}
}
