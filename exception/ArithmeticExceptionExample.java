/* Write a Java program that divides two numbers entered by the
 * user. Handle the ArithmeticException that may occur if the
 * user attempts to divide by zero.
 */

package exception;

import java.util.*;
public class ArithmeticExceptionExample 
{
	static int numerator,denominator,result;
	static Scanner sc=new Scanner(System.in);
	
	public static void accept()
	{
		System.out.println("Enter first number: ");
		numerator=sc.nextInt();
		System.out.println("Enter second number: ");
		denominator=sc.nextInt();
	}
	
	public static void arithmeticException()
	{
		accept();
		if(denominator!=0)
		{
			result=numerator/denominator;
			System.out.println("Result= "+result);
		}
		else
			throw new ArithmeticException("Number is not divisible by zero");
	}
	public static void main(String[] args)
	{
		arithmeticException();
	}
}
