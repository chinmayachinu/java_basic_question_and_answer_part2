import java.util.Scanner;
class ArrayMerge
{
	private int []A,B,C;
	private int i,n,c;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a element to A");
		A=new int[1];
		A[0]=sc.nextInt();
		System.out.println("Enter no. elements to array B");
		n=sc.nextInt();
		System.out.println("The "+n+" elements of B are");
		B=new int[n];
		for(i=0;i<n;i++)
		{
			B[i]=sc.nextInt();
		}
		c=n+1;
	}
	public void merge()
	{
		C=new int[c];
		C[0]=A[0];
		for(i=1;i<c;i++)
		{
			C[i]=B[i-1];
		}
	}
	public void display()
	{
		System.out.println("After merging the array elements of C=");
		for(i=0;i<c;i++)
		{
			System.out.print(C[i]+"\t");
		}
	}
	public static void main(String args[])
	{
		ArrayMerge s=new ArrayMerge();
		s.input();
		s.merge();
		s.display();
	}
}
