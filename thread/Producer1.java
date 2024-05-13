package thread;
import java.util.Scanner;
public class Producer1 
{
	int saree=500;
	Scanner sc=new Scanner(System.in);
	public void quantityOfSarees()
	{
		System.out.println("Sarees available in our store: "+saree);
	}
	synchronized void process(int s_qty) 
	{
		saree=saree-s_qty;
		if(saree>0) 
		{
			System.out.println("This is my process giving the Sarees");
			System.out.println("The remaining quantity of Sarees: "+saree);
		}
		else if(saree==0)
		{
			System.out.println(s_qty+" Sarees not available in our shop");
		}
		else
		{
			System.out.println(-(saree)+" sarees are not available in our shop");
		}
	}
}
