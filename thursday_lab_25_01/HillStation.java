package thursday_lab_25_01;

class HillStation 
{
	void location()
	{
		System.out.println("It shows the location of famous places");
	}
	
	void famousfor()
	{
		System.out.println("It shows the famous places");
	}
	
	public static void main(String[] args) 
	{
		HillStation manali=new Manali();
		HillStation mussoorie=new Mussoorie();
		HillStation gulmarg=new Gulmarg();
		
		System.out.println("Famous Place in Manali: ");
		manali.famousfor();
		manali.location();
		System.out.println("-------------------------------------------------");
		System.out.println("Famous Place in Mussoorie: ");
		mussoorie.famousfor();
		mussoorie.location();
		System.out.println("-------------------------------------------------");
		System.out.println("Famous Place in Gulmarg");
		gulmarg.famousfor();
		gulmarg.location();
	}
}
