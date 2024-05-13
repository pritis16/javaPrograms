package thursday_lab;
import java.util.*;
class Car_details
{
	Scanner sc=new Scanner(System.in);
	public String name,model;
	public int age,year,car_num;
	private long mobnum;                       //Encapsulation
	
	public void details()              
	{
		System.out.println("Enter car model: ");
		model=sc.next();
		System.out.println("Enter car car_no: ");
		car_num=sc.nextInt();
		System.out.println("Enter car purchasing year: ");
		year=sc.nextInt();
	}
	
	public long getMobno() {
		return mobnum;
	}

	public void setMobno(long mobno) {
		this.mobnum = mobno;
	}
}
