package thursday_lab;

import java.util.Scanner;

public class EmployeeDetail
{
	public String empName,country;
	public boolean isIndian;
	public double empSal;
	
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter employee name: ");
		empName=sc.next();
		System.out.println("Enter employee salary: ");
		empSal=sc.nextDouble();
		System.out.println("Choose your nationality");
		System.out.println("1]Indian\n2]Other");
		switch(sc.nextInt())
		{
		case 1:
			isIndian=true;
			break;
		default:isIndian=false;
		}
	}
	
}
