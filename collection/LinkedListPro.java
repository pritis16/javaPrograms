package collection;
import java.util.*;
public class LinkedListPro 
{
	String place;
	LinkedList<String> my_place=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
	
	public void addPlaceAtParticular()
	{
		int ind;
		if(my_place.isEmpty())
		{
			System.out.println("List is empty so place is add in list");
			addFavouritePlace();
		}
		else
		{
			System.out.println("Enter your favorite place name: ");
			place=sc.nextLine();
			System.out.println("Enter position or index: ");
			ind=sc.nextInt();
			my_place.set(ind, place);
		}
		viewFavouritePlace();
	}
	
	public void addFavouritePlace()
	{
		System.out.println("Enter your favorite place name: ");
		place=sc.nextLine();
		
		my_place.add(place);
		//viewFavouritePlace();
	}
	
	public void deleteFavouritePlace()
	{
		System.out.println("Enter your favorite place name: ");
		place=sc.next();
		if(my_place.isEmpty())
		{
			System.out.println("List is empty so place is add in list");
			addFavouritePlace();
		}
		else
		{
			my_place.remove(place);
		}
		viewFavouritePlace();
	}
	
	public void viewFavouritePlace()
	{
		if(my_place.isEmpty())
		{
			System.out.println("Kindly add favorite place first: ");
			addFavouritePlace();
		}
		else
		{
			System.out.println("My favorite place are: ");
		}
		Iterator<String> itr=my_place.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public void sortFavouritePlace()
	{
		if(my_place.isEmpty())
		{
			System.out.println("List is empty so place is add in list");
			addFavouritePlace();
		}
		else
		{
			Collections.sort(my_place);
			Iterator<String> itr=my_place.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
	}
}
