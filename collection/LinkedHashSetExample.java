package collection;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Iterator;

class LinkedHashSetMethods
{
	int num;
	LinkedHashSet<Object> obj=new LinkedHashSet<>();
	Scanner sc=new Scanner(System.in);
	
	public void insertElement()
	{
		System.out.println("Enter number: ");
		num=sc.nextInt();
		
		obj.add(num);
		
		System.out.println(obj);
	}
	
	public void elementContain()
	{
		System.out.println("Enter number: ");
		num=sc.nextInt();
		
		if(obj.contains(num)==true)
			System.out.println(num+" number is here in Set");
		else
			System.out.println(num+" number is not here in Set");
	}
	
	public void element_isEmpty()
	{
		if(obj.isEmpty()==true)
			System.out.println("HashSet is Empty");
		else
			System.out.println("HashSet is not Empty");
	}
	
	public void elementIterator()
	{
		Iterator itr=obj.iterator();
		System.out.println("The iterator values are: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		obj.iterator();
	}
	
	public void setSize()
	{
		System.out.println("Size of given set is "+obj.size());
	}
	
	public void elementRemove()
	{
		int removeNum;
		System.out.println("Enter number you want to remove: ");
		removeNum=sc.nextInt();
		System.out.println(obj.remove(removeNum)+" number is removed");
		System.out.println(obj);
	}
	
	public void setClear()
	{
		obj.clear();
		System.out.println("set is cleared "+obj);
	}
}

public class LinkedHashSetExample 
{
	public static void switchCase()
	{
		LinkedHashSetMethods hashset=new LinkedHashSetMethods();
		Scanner sc=new Scanner(System.in);
		int choice;
		char yesno;
		
		while(true)
		{
			System.out.println("Methods of HashSet class");
			System.out.println("1. add()\n2. contain()\n3. isEmpty()\n4. iterator()\n5. size()\n6.remove()\n7. clear()\n8. Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					do {
						hashset.insertElement();
						System.out.println("Do you want to add more elements: ");
						yesno=sc.next().charAt(0);
					}while(yesno=='y' || yesno=='Y');
						
					break;
				case 2:
					hashset.elementContain();
					break;
				case 3:
					hashset.element_isEmpty();
					break;
				case 4:
					hashset.elementIterator();
					break;
				case 5:
					hashset.setSize();
					break;
				case 6:
					hashset.elementRemove();
					break;
				case 7:
					hashset.setClear();
					break;
				case 8:
					System.out.println("Successfully Exit");
					System.exit(0);
					break;
				default:
					System.out.println("Choose valid case");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		switchCase();
	}

}
