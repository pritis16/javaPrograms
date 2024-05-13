package exception;

public class Throw_demo {

	public static void main(String[] args) {
		validate(20);
		GRT(2,2);
	}
	
	public static void validate(int age)
	{
		if(age<24)
			throw new ArithmeticException("not valid");
		else
			System.out.println("Welcome to Club");
	}
	public static void GRT(int num1 , int num2)
	{
		if(num1==num2)
		{
			throw new ArrayIndexOutOfBoundsException("Both the number can not be same");
		}
		else if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}
		else
			System.out.println(num1+" is less than "+num2);
	}
}
