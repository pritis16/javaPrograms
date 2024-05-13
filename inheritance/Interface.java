package inheritance;
import java.util.Scanner;
interface BankAccount
{
	void deposit();
	void withdraw();
}
class CheckingAccount implements BankAccount
{
	int balance=5000,withdraw,deposit;
	Scanner sc=new Scanner(System.in);
	@Override
	public void deposit() 
	{
		System.out.println("Your initial amount is "+balance);
		System.out.println("Enter deposit amount: ");
		deposit=sc.nextInt();
		balance+=deposit;
		System.out.println("After deposit your balnce is: "+balance);
	}

	@Override
	public void withdraw() 
	{
		System.out.println("Enter withdraw amount: ");
		withdraw=sc.nextInt();
		if(balance>=withdraw)
		{
			balance-=withdraw;
			System.out.println("After withdraw your balnce is: "+balance);
		}
		else
			System.out.println("your withdraw amount is high as compair to your balnce\tnot withdraw");
	}
	
}

class Vehicle
{
	Scanner sc=new Scanner(System.in);
	String brand,model,year;
	public void drive()
	{
		System.out.println("Enter brand of vehicle: ");
		brand=sc.next();
		System.out.println("Enter model of vehicle: ");
		model=sc.next();
		System.out.println("Enter year of vehicle(dd/mm/yyyy): ");
		year=sc.next();
	}
}
class Car extends Vehicle
{
	
	String color;
	public void honk()
	{
		drive();
		System.out.println("Enter color of vehicle: ");
		color=sc.next();
	}
	public void display()
	{
		System.out.println("Car Details: ");
		System.out.println("---------------------------------------");
		System.out.println("Brand\tModel\tYear(dd/mm/yyyy)\tcolor");
		System.out.println("---------------------------------------");
		System.out.println(brand+"\t"+model+"\t"+year+"\t"+color);
		System.out.println("---------------------------------------");
	}
}
public class Interface 
{

	public static void main(String[] args) 
	{
		CheckingAccount ca=new CheckingAccount();
		ca.deposit();
		ca.withdraw();
		System.out.println("---------------------------------------");
		Car c=new Car();
		c.honk();
		c.display();
	}

}
