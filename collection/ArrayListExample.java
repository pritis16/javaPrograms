package collection;

import java.util.*;

public class ArrayListExample 
{
    int n, i;
    //ArrayList<ArrayListExample> al = new ArrayList<>();
    //String name, email, address;
    ArrayList<String> name=new ArrayList<>();
    ArrayList<String> email=new ArrayList<>(); 
    ArrayList<String>address=new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void accept() 
    {
        System.out.println("How many names you want to enter: ");
        n = sc.nextInt();
        sc.nextLine(); 

        //System.out.println("Enter Details: ");
        for (i = 0; i < n; i++) 
        {
        	System.out.println("Enter "+(i+1)+" Student Detail");
            System.out.println("Enter name: ");
            name.add(sc.next());
            System.out.println("Enter Address: ");
            sc.nextLine();
            address.add(sc.nextLine());
            System.out.println("Enter Email: ");
            email.add(sc.next());
        }
    }
    
    public void display()
    {
    	int i=0;
    	Iterator<String> itr_name=name.iterator();
    	Iterator<String> itr_addr=address.iterator();
    	Iterator<String> itr_email=email.iterator();
    	while(itr_name.hasNext() || itr_addr.hasNext() || itr_email.hasNext())
    	{
    		System.out.println("Display "+(i+1)+" Student Detail");
    		System.out.println("Name: "+itr_name.next());
    		System.out.println("Address: "+itr_addr.next());
    		System.out.println("Email: "+itr_email.next());
    		i++;
    	}
    }
    
	public static void main(String[] args) 
	{
		ArrayListExample obj=new  ArrayListExample();
		obj.accept();
		obj.display();
	}

}
