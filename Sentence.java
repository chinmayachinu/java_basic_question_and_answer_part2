import java.util.Scanner;
class Sentence
{
	private String A[];
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		A=new String[3];
		int i;
		for(i=0;i<3;i++)
		{
			A[i]=sc.next();
		}
	}
	public void display()
	{
		int i;
		System.out.println("The reverse sentence is");
		for(i=2;i>0;i--)
		{
			System.out.println(A[i]+" "+A[i-1]+" "+A[i-2]);
			break;
		}
	}
	public static void main(String args[])
	{
		Sentence s=new Sentence();
		s.input();
		s.display();
	}
}