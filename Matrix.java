import java.util.Scanner;
class Matrix
{
	private int m,n,j,i,s=0,c=0;
	private int A[][];
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements to m*n matrix having rows and columns=");
		m=sc.nextInt();
		n=sc.nextInt();
		A=new int[m][n];
		System.out.println("The "+m+"*"+n+" matrix is");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
	}
	public void display()
	{
	 	for(i=0;i<m;i++)
		{
			s=0;
			for(j=0;j<A[i].length;j++)
			{
				s=s+A[i][j];
			}
			System.out.println("The sum of "+(i+1)+" row="+s);
		}
		for(j=0;j<n;j++)
		{
			c=0;
			for(i=0;i<m;i++)
		    {
				c=c+A[i][j];
			}
			System.out.println("The sum of "+(j+1)+" column="+c);
		}
	}
	public static void main(String args[])
	{
		Matrix mx=new Matrix();
		mx.input();
		mx.display();
	}

}



