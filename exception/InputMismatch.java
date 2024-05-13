package exception;

import java.util.*;
public class InputMismatch 
{
//	public int num;
//	Scanner sc=new Scanner(System.in);
	
	/*public void inputMismatch()
	{
		System.out.println("Enter input: ");
		num=sc.nextInt();
		
		try
		{
			System.out.println("Enterrd number is "+num);
		}
		catch(InputMismatchException ie)
		{
			//System.out.println(ie.getMessage());
			System.out.println("the input should be integer");
		}	
	}*/
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
//		InputMismatch im=new InputMismatch();
//		im.inputMismatch();
		
		System.out.println("Enter input: ");
		num=sc.nextInt();
		
		try
		{
			System.out.println("Enterrd number is "+num);
		}
		catch(InputMismatchException ie)
		{
			//System.out.println(ie.getMessage());
			System.out.println("the input should be integer");
		}
	}
}
