package thread;
import java.util.Scanner;
public class Customer1 extends Thread
{
	Producer1 p;
	int s_qty;
	Scanner sc=new Scanner(System.in);
	public Customer1(Producer1 p) {
		this.p=p;
	}
	public void run()
	{
		System.out.println("Enter quantity: ");
		s_qty=sc.nextInt();
		p.process(s_qty);
	}
}

class Customer2 extends Thread
{
	Producer1 p;
	int s_qty;
	Scanner sc=new Scanner(System.in);
	public Customer2(Producer1 p) {
		this.p=p;
	}
	public void run()
	{
		System.out.println("Enter quantity: ");
		s_qty=sc.nextInt();
		p.process(s_qty);
	}
}
