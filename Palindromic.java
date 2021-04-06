//palindromic number using function
import java.util.Scanner;
class Palindromic
{
	static int isPalin(int x)
	{
		int r=0,d;
		while(x!=0)
		{
			d=x%10;
			r=r*10+d;
			x=x/10;
		}
		return r;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int num=n;
		int c=isPalin(n);
		if(c==num)
		    System.out.println("Its a palindromic number");
		else
			System.out.println("Not a palindromic number");
	}
}
