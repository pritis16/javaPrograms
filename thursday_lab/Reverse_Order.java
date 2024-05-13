package thursday_lab;

public class Reverse_Order extends Thread
{
	int num=9999,i;
	
	public void run()
	{
		System.out.println("To display 1 to 9999 in reverse order: ");
		for(i=num;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
