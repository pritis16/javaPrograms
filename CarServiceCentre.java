import java.util.*;
class Car_details
{
	Scanner sc=new Scanner(System.in);
	public String name,model;
	public int age,year,car_num;
	private int mobnum;                       //Encapsulation
	
	public void details()              
	{
		System.out.println("Enter car model: ");
		model=sc.next();
		System.out.println("Enter car car_no: ");
		car_num=sc.nextInt();
		System.out.println("Enter car year: ");
		year=sc.nextInt();
	}
	
	public int getMobno() {
		return mobnum;
	}

	public void setMobno(int mobno) {
		this.mobnum = mobno;
	}
}

abstract class Customer_Detail extends Car_details      //abstraction and inheritance
{
	
	public void details()                  
	{
		System.out.println("Enter customer name: ");
		name=sc.next();
		System.out.println("Enter customer age: ");
		age=sc.nextInt();
		System.out.println("Enter customer phone number: ");
		setMobno(sc.nextInt());
		super.details();
	}
	
	abstract void services();
}
class Car_Services extends Customer_Detail
{
	String bill="";
	int choice,price;
	public char inn_yesno,yesno;
	
	@Override
	void services() {
		
		do
		{
			System.out.println("***** Services in Our Centre *****");
			System.out.println("1:Basic Problems\n2:Engine Problem\n3:Other");
			System.out.println("Enter services you want: ");
			choice=sc.nextInt();
			switch(choice) 
			{
				case 1:
					basicProblem();
					break;
				case 2:
					engineProblem();
					break;
				case 3:
					other();
					break;
				default:
					System.out.println("Please select valid service");
			}
			System.out.println("Do you want more sevices(y/n): ");
			yesno=sc.next().charAt(0);
		}while(yesno=='y' || yesno=='Y');
		
	}
	
	public void basicProblem()
	{
		do
		{
			System.out.println("***** Basic Services Car *****");
			System.out.println("1:Overheating\n2:Dead Battery\n3:Flat Tires\n4:issues starting the car");
			System.out.println("Enter services you want: ");
			choice=sc.nextInt();
			switch(choice) 
			{
				case 1:
					System.out.println("Your Engine Overheating issue is solved");
					setPrice(300+getPrice());
					bill+="\nOverheating\t\t300";
					break;
				case 2:
					System.out.println("Your Engine Overheating issue is solved");
					setPrice(470+getPrice());
					bill+="\nDead Battery\t\t470Rs";
					break;
				case 3:
					System.out.println("Your Engine Overheating issue is solved");
					setPrice(500+getPrice());
					break;
				case 4:
					System.out.println("Your Engine Overheating issue is solved");
					setPrice(700+getPrice());
					break;
				default:
					System.out.println("Please select valid service");
			}
			System.out.println("Do you want more basic sevices(y/n): ");
			inn_yesno=sc.next().charAt(0);
		}while(inn_yesno=='y' || inn_yesno=='Y');	
		
	}

	public void other()
	{
		do
		{
			System.out.println("***** Other Services Car *****");
			System.out.println("1:Car Wash\n2:Car Paint");
			System.out.println("Enter services you want: ");
			choice=sc.nextInt();
			switch(choice) 
			{
				case 1:
					System.out.println("Your Engine Overheating issue is solved");
					setPrice(450+getPrice());
					break;
				case 2:
					System.out.println("Your Engine Overheating issue is solved");
					setPrice(600+getPrice());
					break;
				default:
					System.out.println("Please select valid service");
			}
			System.out.println("Do you want more other sevices(y/n): ");
			inn_yesno=sc.next().charAt(0);
		}while(inn_yesno=='y' || inn_yesno=='Y');	
		
	}
	
	public void engineProblem()
	{
		do
		{
			System.out.println("***** Engine Services Car *****");
			System.out.println("1:Fail Fuel Pump\n2:Flude Filter\n3:Break Fail\n4:Lubrication issue\n5:AC Problem");
			System.out.println("Enter services you want: ");
			choice=sc.nextInt();
			switch(choice) 
			{
				case 1:
					System.out.println("Your Fail Fuel Pump issue is solved");
					setPrice(1500+getPrice());
					bill+="\nFail Fuel Pump\t\t1500Rs.";
					break;
				case 2:
					System.out.println("Your Flude Filter issue is solved");
					setPrice(2000+getPrice());
					bill+="\nFlude Filter\t\t2000Rs.";
					break;
				case 3:
					System.out.println("Your Lubrication issue is solved");
					setPrice(800+getPrice());
					bill+="\nLubrication issue\t\t800Rs.";
					break;
				case 4:
					System.out.println("Your car break is repaired");
					setPrice(950+getPrice());
					bill+="Break Fail\t\t950";
					break;
				case 5:
					System.out.println("Your car AC is repaired");
					setPrice(3000+getPrice());
					bill+="\nAC Problem\t\t3000Rs.";
					break;
				default:
					System.out.println("Please select valid service");
			}
			System.out.println("Do you want more engine sevices(y/n): ");
			inn_yesno=sc.next().charAt(0);
		}while(inn_yesno=='y' || inn_yesno=='Y');	
		
	}
	
	private void setPrice(int pr) {
		 price=pr;
		
	}

	private int getPrice() {
		return price;
	}
}

class BillDetail extends Car_Services
{
	char choice1;
	public void billDetails()
	{
		System.out.println("------------ BILL ------------");
		System.out.println("______________________________________________________");
		System.out.println("Services\t\tCost");
		System.out.println("______________________________________________________");
		System.out.println(bill);
		System.out.println("______________________________________________________");
		System.out.println("Total Bill \t\t"+price+" Rs.\n");
		System.out.println("Thanks for Coming......");
	}
	public void paymentDetail()
	{
		int min=0000,max=9999,otp,get_otp;
		
		System.out.println("You need to pay the ammount choose following option: ");
		System.out.println("1:Cash\n2:Online");
		choice=sc.nextInt();
		if(choice==1)
			System.out.println("Amount is Successfully paid");
		else if(choice==2)
		{
			System.out.println("A]PhonePe\nB]Google Pay\nC]Paytm");
			choice1=sc.next().charAt(0);
			if(choice1=='A')
			{
				otp=(int)(Math.random()*(max-min+1)+min);
				System.out.println("your OTP is "+otp);
				System.out.println("Enter your otp: ");
				get_otp=sc.nextInt();
				if(get_otp==otp)
					System.out.println("Amount is Successfully paid");
				else
					System.out.println("invalid otp");
			}
			
		}
	}
}

public class CarServiceCentre 
{
	public static void main(String[] args)
	{	
		BillDetail bil=new BillDetail();
		bil.details();         //method override
		bil.services();
		bil.billDetails();
		bil.paymentDetail();
	}
}
