package thread;

public class ClothShop {

	public static void main(String[] args) throws InterruptedException 
	{
		Producer1 p=new Producer1();
		Customer1 c1=new Customer1(p);
		Customer2 c2=new Customer2(p);
		
		p.quantityOfSarees();
		
		c1.start();
		c1.join();
		c2.join();
//		try 
//		{
//			c1.join();
//		} 
//		catch (InterruptedException e) 
//		{
//			e.printStackTrace();
//		}
//		c2.start();
//		try 
//		{
//			c2.join();
//		} 
//		catch (InterruptedException e) 
//		{
//			e.printStackTrace();
//		}
	}

}
