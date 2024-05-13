package exception;

import java.util.*;
public class Try_demo {

	public static void main(String[] args) 
	{
		demo();
	}
	public static void demo()
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,result;
		System.out.println("Enter two number: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int[] arr= {1,2,3,4,5};
		try
		{
			result=num1+num2;
			System.out.println("Addition: "+result);
			result=num1-num2;
			System.out.println("Subtraction: "+result);
			result=num1/num2;
			System.out.println("Division: "+result);
			result=num1*num2;
			System.out.println("Multiplication: "+result);
			result=num1%num2;
			System.out.println("Mod: "+result);
			
			System.out.println("The value is= "+arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException aibe)
		{
			System.out.println(aibe.getMessage());
		}
		catch(ArithmeticException ae)
		{
			//System.out.println(ae.getMessage());
			System.out.println("The number is not divisible by zero\n");
			//demo();
		}
		
		finally
		{
			System.out.println("Hii this is finally block");
		}
		sc.close();
	}

}
