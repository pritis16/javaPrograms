package thursday_lab;

public class DisplayMessage extends Thread 
{
	public String message;
	
	public DisplayMessage(String message)
	{
		this.message=message;
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println(message);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			//System.out.println(e.getMessage());
		}
	}
}
