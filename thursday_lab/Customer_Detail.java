package thursday_lab;

abstract class Customer_Detail extends Car_details      //abstraction and inheritance
{
	
	@Override
	public void details()         //Polymorphism(method override)         
	{
		System.out.println("Enter customer name: ");
		name=sc.next();
		System.out.println("Enter customer age: ");
		age=sc.nextInt();
		System.out.println("Enter customer phone number: ");
		setMobno(sc.nextLong());
		super.details();
	}
	
	abstract void services();
}