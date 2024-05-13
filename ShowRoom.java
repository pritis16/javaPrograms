import java.util.Scanner;
public class ShowRoom 
{
	String name;
	long mobno;
	double cost,disamt,amount;
	Scanner sc=new Scanner(System.in);
	public ShowRoom()
	{
		name="";
		mobno=0;
		cost=0.00;
		disamt=0.0;
		amount=0.0;
		
	}
	void input()
	{
		System.out.println("Enter customer name: ");
		name=sc.next();
		System.out.println("Enter customer mobile no.: ");
		mobno=sc.nextLong();
		System.out.println("Enter cost: ");
		cost=sc.nextDouble();
	}
	void calculate()
	{
		if(cost==10000)
		{
			System.out.println("Discount is 5%");
			disamt=cost*0.05;
			amount=cost-disamt;
		}
		else if(cost>10000 && cost <=20000)
		{
			System.out.println("Discount is 10%");
			disamt=cost*0.1;
			amount=cost-disamt;
		}
		else if(cost>20000 && cost<=35000)
		{
			System.out.println("Discount is 15%");
			disamt=cost*0.15;
			amount=cost-disamt;
		}
		else if(cost>35000)
		{
			System.out.println("Discount is 20%");
			disamt=cost*0.2;
			amount=cost-disamt;
		}
		else
		{
			System.out.println("No Discount");
			disamt=0.0;
			amount=cost;
		}
	}
	void display()
	{
		System.out.println("Customer Name\tMobile No.\tDiscount Amount\t\tAmount");
		System.out.println("--------------------------------------------------------------");
		System.out.println(name+"\t\t"+mobno+"\t\t"+disamt+"\t\t"+amount);
	}
	
	public static void main(String[] args) 
	{
		ShowRoom sr=new ShowRoom();
		sr.input();
		sr.calculate();
		sr.display();
	}

}
