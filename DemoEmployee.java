import java.util.Scanner;
class Employee
{
	private int empno;
	private double salary,tax;
	private String name;
	public Employee(int emplyno,String nm,double slry)
	{
		empno=emplyno;
		name=nm;
		salary=slry;
	}
	public void calcTax()
	{
		if(salary<=25000)
			tax=0.5*salary;
		else
			tax=0.1*(salary-25000);
	}
	public void display()
	{
		System.out.println("Employee number is "+empno+",name is "+name+",salary is "+salary+" and tax is "+tax);
	}
}
class DemoEmployee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee number,name,salary");
		int x=sc.nextInt();
		String y=sc.next();
		double z=sc.nextDouble();
		Employee em=new Employee(x,y,z);
		em.calcTax();
		em.display();
	}
}
