//Q2)WAP to create a mini calculator ask the user what operation the user wants
//to perform, and repeat the task till the user wants to perform any operation.

import java.util.Scanner;

public class MiniCalc 
{
	int num1,num2,add,sub,mul,mod;
	double div;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
	}
	void addition()
	{
		accept();
		add=num1+num2;
		System.out.println("Addition= "+add);
	}
	void subtraction()
	{
		accept();
		sub=num1-num2;
		System.out.println("subtraction= "+sub);
	}
	void multiplication()
	{
		accept();
		mul=num1*num2;
		System.out.println("multiplication= "+mul);
	}
	void division()
	{
		accept();
		div=num1/num2;
		System.out.println("division= "+div);
	}
	void modulus()
	{
		accept();
		mod=num1%num2;
		System.out.println("Remainder: "+mod);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		MiniCalc calc=new MiniCalc();
		char choice;
		while(true)
		{
			System.out.println("Enter your choice(*,+,-,/,%): ");
			choice=sc.nextLine().charAt(0);
			switch(choice)
			{
				case '+':
					calc.addition();
					break;
				case '*':
					calc.multiplication();
					break;
				case '-':
					calc.subtraction();
					break;
				case '/':
					calc.division();
					break;
				case '%':
					calc.modulus();
					break;
				default:
					System.out.println("Enter valid choice");	
			}
		}
	}

}
