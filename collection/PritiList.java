package collection;

public class PritiList extends ArrayListPro
{
	public static void main(String[] args)
	{
		PritiList obj=new PritiList();
		obj.myShoppingDay();
	}
	
	public void myShoppingDay()
	{
		char yesno;
		do
		{
			System.out.println("Select your choice: ");
			System.out.println("1. Add Item\n2. View all the items\n3. Delete Item\n4. Sort Item\n5. Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					addItem();
					break;
				case 2:
					viewItem();
					break;
				case 3:
					deleteItem();
					break;
				case 4:
					sortItem();
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Please Enter the valid case");
			}
			System.out.println("You want to view more cases(y/n): ");
			yesno=sc.next().charAt(0);
		}while(yesno=='y' || yesno=='Y');
		
	}
}
