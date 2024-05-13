package collection;
import java.util.*;
public class ArrayListPro 
{
	String ch;
	ArrayList<String> my_item=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public void addItem()
	{
		System.out.println("Enter your item name: ");
		ch=sc.next();
		my_item.add(ch);
	}
	
	public void deleteItem()
	{
		System.out.println("Enter your item name: ");
		ch=sc.next();
		my_item.remove(ch);
	}
	
	public void viewItem()
	{
		if(my_item.isEmpty())
		{
			System.out.println("My Item are: ");
		}
		else
		{
			System.out.println("Kindly add items first: ");
		}
		Iterator<String> itr=my_item.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public void sortItem()
	{
		Collections.sort(my_item);
		Iterator<String> itr=my_item.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
