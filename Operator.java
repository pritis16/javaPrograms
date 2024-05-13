import java.util.Scanner;
public class Operator 
{
	public static void main(String[] args) 
	{
		int num1,num2,sum,sub,mul,div,remain,choice,max,min;
		boolean result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
		while(true)
		{
			System.out.println("***** MENU *****");
			System.out.println("1)Arithmetic Operator\n2)Logical Operator\n3)Relational Operator\n4)Bitwise Operator\n5)Conditional Operator\n6)Assignment Operator\n7)Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1://For Arithmentic operator
					System.out.println("----- Arithmetic Operator -----");
					System.out.println("num1= "+num1+"\nnum2= "+num2);
					sum=num1+num2;
					System.out.println("Addition of two number is: "+sum);
					
					sub=num1-num2;
					System.out.println("Subtraction of two number is: "+sub);
					
					mul=num1*num2;
					System.out.println("Multiplication of two number is: "+mul);
					
					div=num1/num2;
					System.out.println("Division of two number is: "+div);
					
					remain=num1%num2;
					System.out.println("Remainder is: "+remain);
					break;
					
				case 2://for Logical operator
					System.out.println("----- Logical Operator -----");
					System.out.println("num1= "+num1+"\nnum2= "+num2);
					result=num1>num2 && num1>0; //logical and
					System.out.println("Result: "+result);
					
					result=num2>num1 || num2>0; //logical or
					System.out.println("Result: "+result);
					
					result=!(num2>num1 && num2>0); //logical or
					System.out.println("Result: "+result);
					break;
					
				case 3: //for Relational operator
					System.out.println("----- Relational Operator -----");
					System.out.println("num1= "+num1+"\nnum2= "+num2);
					if(num1>num2)
						System.out.println(num1+" is greater than "+num2);
					else if(num1!=num2)
						System.out.println("two numbers are not equal");
					else if(num1<num2)
						System.out.println(num1+" is less than "+num2);
					else
						System.out.println("two numbers are equal");
					break;
					
				case 4://for bitwise operator
					System.out.println("----- Bitwise Operator -----");
					System.out.println("num1= "+num1+"\nnum2= "+num2);
					System.out.println(num1+" & "+num2+"="+(num1&num2));
					System.out.println(num1+" | "+num2+"="+(num1|num2));
					System.out.println(num1+" ^ "+num2+"="+(num1^num2));
					System.out.println("~"+num1+"="+(~num1));
					System.out.println("~"+num2+"="+(~num2));
					break;
					
				case 5: //for conditional operator
					max=(num1>num2)?num1:num2;
					System.out.println("Maximum number is: "+max);
					min=(num1<num2)?num1:num2;
					System.out.println("Minimum number is: "+min);
					break;
					
				case 6: //for assignment operator
					System.out.println("----- Assignment Operator -----");
					System.out.println("num1= "+num1+"\nnum2= "+num2);
					num1+=num2;
					System.out.println("Addition:"+num1);
					num1-=num2;
					System.out.println("Subtraction:"+num1);
					num1*=num2;
					System.out.println("Multiplication:"+num1);
					num1/=num2;
					System.out.println("Division:"+num1);
					num1%=num2;
					System.out.println("Remainder:"+num1);
					break;
				
				case 7:
					System.exit(0);
					break;
				default:
					System.out.println("Sorry! Please Enter Valid Choice");
			}
			System.out.println();
		}
	}
}
