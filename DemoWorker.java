import java.util.*;
class Worker
{
	private int wno;
	private String name;
	private int noh,wage;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the worker number,name and number of hours worked");
		wno=sc.nextInt();
		name=sc.next();
		noh=sc.nextInt();
	}
	public void calcWage()
	{
		if(noh<=50)
			wage=200;
		else
			wage=250;
	}
	public void display()
	{
		System.out.println("The worker number is "+wno+", name is "+name+",number of hours worked is "+noh+",wage is "+wage);
	}
}
class DemoWorker
{
	public static void main(String args[])
	{
		Worker w=new Worker();
		w.input();
		w.calcWage();
		w.display();
	}
}


