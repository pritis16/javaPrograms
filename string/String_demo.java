package string;
import java.util.Scanner;
public class String_demo 
{
	Scanner sc=new Scanner(System.in);
	public void string_lit()
	{
		String name;
		System.out.println("Enter your name: ");
		name=sc.next();
		
		System.out.println("Name: "+name);
	}
	public void string_new()
	{
		String add;
		System.out.println("Enter address: ");
		//String s=new String();
		sc.nextLine();
		add=sc.nextLine();
		
		System.out.println("Address: "+add);
	}
	public static void main(String[] args)
	{
		String_demo sd=new String_demo();
		sd.string_lit();
		sd.string_new();
	}
}
