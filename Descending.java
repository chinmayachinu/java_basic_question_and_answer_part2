import java.util.Scanner;
class Descending
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers to the array");
		int A[]=new int[10];
		int i;
		for(i=0;i<10;i++)
		{
			A[i]=sc.nextInt();
		}
		int h=A[0];
		int p=0,j;
		int B[]=new int[10];
		for(j=0;j<10;j++)
		{
			h=A[0];
			p=0;
			for(i=0;i<10;i++)
			{
				if(A[i]>h)
				{
					h=A[i];
					p=i;
				}
			}
			B[j]=h;
			A[p]=A[p]-h;
		}
		System.out.println("Now the after Descending the elements are ");
		for(j=0;j<10;j++)
		{
			System.out.print(B[j]+",");
		}
	}
}





