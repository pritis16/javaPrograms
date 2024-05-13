package autobox_unbox_garbcollec;
import java.util.Scanner;
public class Demo
{
	int num,choice;
	char yesno;
	Integer obj;
	Scanner sc=new Scanner(System.in);
	public void switchCase()
	{
		do
		{
			System.out.println("******* Prrocess ********");
			System.out.println("----------------------------");
			System.out.println("1: Boxing\n2: Unboxing\n3: Garbage Collection");
			System.out.println("----------------------------\n");
			System.out.println("Chosse the process you need to check: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					boxingExample();
					break;
				case 2:
					unboxingExample();
					break;
				case 3:
					garbagecollectionExample();
					break;
				default :
					System.out.println("Please choose valid choice");
			}
			System.out.println("Do you want to check more process(y/n)");
			yesno=sc.next().charAt(0);
		}while(yesno=='Y'||yesno=='y');
	}
	
	public void boxingExample()
	{
		System.out.println("This is the example of Boxing");
		System.out.println("Enter number you want to store into object of class: ");
		num=sc.nextInt();
		obj=new Integer(num);
		System.out.println("Stored number in object of Integer class: "+obj);
	}
	
	public void unboxingExample()
	{
		System.out.println("This is the example of UnBoxing");
		System.out.println("Enter number you want to store into variable: ");
		obj=sc.nextInt();
		num=obj;
		System.out.println("Stored number in variable: "+num);
	}
	public void finalize()
	{
		System.out.println("Object is Garbage Collected");
	}
	public void garbagecollectionExample()
	{
		Demo dem1=new Demo();
		Demo dem2=new Demo();
		dem1=null;
		dem2=null;
		System.gc();
	}
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.switchCase();
	}

}
