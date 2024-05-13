/*Define Product class with name, price, and sort it price wise (use comparable interface)*/ 

package thursday_lab_15feb;

import java.util.*;
class Product implements Comparable<Product>
{
	ArrayList<Product> productList=new ArrayList<>();
	String name;
	int price;
	
	public Product(String name,int price) {
		this.name=name;
		this.price=price;
	}
	
	public int compareTo(Product prodPrice) 
	{
		return Integer.compare(this.price, prodPrice.price);
	}
	
}

public class Que1 
{
	ArrayList<Product> productList=new ArrayList<>();
	String name;
	int price;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		int num,i;
		
		System.out.println("How many products you want: ");
		num=sc.nextInt();
		System.out.println("Enter "+num+" products");
		for(i=0;i<num;i++)
		{
			System.out.println("Enter Product name: ");
			//sc.nextLine();
			name=sc.next();
			System.out.println("Enter product price: ");
			price=sc.nextInt();
			
			Product product=new Product(name, price);
			productList.add(product);
		}
	}
	
	public void display() 
	{
		int i=0;
		
		Collections.sort(productList);
		Iterator<Product> itr=productList.iterator();
		
		System.out.println("Display Product Detail");
		System.out.println("--------------------------------------");
		System.out.println("Name\t\tPrice");
		while(itr.hasNext())
		{
			Product product = itr.next();
			System.out.println((i+1)+". "+product.name+"\t\t"+product.price);
			i++;
		}
	}
	
	public static void main(String[] args) {
		Que1 obj=new Que1();
		obj.accept();
		obj.display();
	}
}
