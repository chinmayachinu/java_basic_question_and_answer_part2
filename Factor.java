import java.util.Scanner;
class Factor
{
	static void factorOf(int x)
	{
		int i;
		System.out.println("The factors of the number "+x+" =");
		for(i=1;i<=x;i++)
		{
			if(x%i==0)
				System.out.println(i);
		}
	}
	static void factorOf(int x,int y)
	{
		int i;
		System.out.println("The common factors of the two numbers");
		for(i=1;i<=x && i<=y;i++)
		{
			if(x%i==0 && y%i==0)
				System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.All factors of a number");
		System.out.println("2.Common factors of two number");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1: System.out.println("Enter a number");
					int a=sc.nextInt();
					factorOf(a);
			        break;
			case 2:	System.out.println("Enter two number");
					int b=sc.nextInt();
					int c=sc.nextInt();
					factorOf(b,c);
					break;
		}
	}
}

