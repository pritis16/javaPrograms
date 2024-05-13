//Q1)Write a program to do the process by using inheritance. create a class 
//which will having the process of prime number  series, check the given no 
//is palindrome number. Create another class which will check the given no is 
//armstrong number or not .and also will generate below pattern
//
//1      
//121
//12321
//1234321


package inheritance;

import java.util.Scanner;
class Prime
{
	int num,flag,i;
	Scanner sc=new Scanner(System.in);
	
	//to check no is prime or not 
	public void accept()
	{
		System.out.println("How many number series you want");
		num=sc.nextInt();
		int count=0,i=2;
		while(count<num) 
		{
			boolean flag=true;
			for(int j=2;j<=i/2;j++) 
			{
				if(i%j==0) 
				{
					flag=false;
					break;
				}
			}
			if(flag==true) {
				count++;
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
	}
}
class Pallindrome extends Prime
{
	//to check no. is pallindrome or not
	public void accept1()
	{
		Scanner sc=new Scanner(System.in);
		int num1;
		System.out.println("Enter number you want to check: ");
		num1=sc.nextInt();
		int temp,reverse=0,rem;
		temp=num1;
		while(temp!=0)
		{
			rem=temp%10;
			reverse=(reverse*10)+rem;
			temp=temp/10;
		}
		if(num1==reverse)
			System.out.println(num1+" is Pallindrome");
		else
			System.out.println(num1+" is not Pallindrome");
	}
}
class Armstrong extends Pallindrome
{
	int rem,temp,count,result,num2;
	Scanner sc=new Scanner(System.in);
	public void accept2()
	{
		System.out.println("Enter number you want to check: ");
		num2=sc.nextInt();
		temp=num2;
		count=0;
		while(temp>0)
		{
			temp/=10;
			count++;
		}
		temp=num2;
		while(temp>0)
		{
			rem=temp%10;
			result+=Math.pow(rem, count);
			temp/=10;
		}
		if(num2==result)
			System.out.println(num2+" is Armstrong");
		else
			System.out.println(num2+" is not Armstrong");
	}
}
class Pattern extends Armstrong
{
	public void accept3()
	{
		Scanner sc=new Scanner(System.in);
		int num3,i,j;;
		System.out.println("How many rows you want: ");
		num3=sc.nextInt();
		for(i=1;i<=num3;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(j);
			for(j=i-1;j>=1;j--)
				System.out.print(j);
			System.out.println();
		}
	}
}


public class MultiInheritance 
{

	public static void main(String[] args) 
	{
		Pattern p=new Pattern();
		System.out.println("Prime number Series");
		p.accept();
		System.out.println("-------------------------------------");
		System.out.println("Pallindrome number check");
		p.accept1();
		System.out.println("-------------------------------------");
		System.out.println("Armstrong number");
		p.accept2();
		System.out.println("-------------------------------------");
		System.out.println("Pattern");
		p.accept3();
		
	}

}
