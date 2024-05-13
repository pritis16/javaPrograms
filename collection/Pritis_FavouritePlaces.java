package collection;

public class Pritis_FavouritePlaces extends LinkedListPro
{
	public static void main(String[] args)
	{
		Pritis_FavouritePlaces obj=new Pritis_FavouritePlaces();
		obj.myShoppingDay();
	}
	
	public void myShoppingDay()
	{
		char yesno;
		do
		{
			System.out.println("Select your choice: ");
			System.out.println("1. View all the items\n2. Add Place At Particular Location\n3. Delete Item\n4. Sort Item\n5. Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					viewFavouritePlace();
					break;
				case 2:
					addPlaceAtParticular();
					break;
				case 3:
					deleteFavouritePlace();
					break;
				case 4:
					sortFavouritePlace();
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
