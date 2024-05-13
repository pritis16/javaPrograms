/*3)Write a program to accept choice from the user and perform the operation
      1.Find out greater between 3 NO
      2.Check given no is even or odd
      3.Check the given character is vowel or not
      4.check the given no is divible by 5 or not
*/
import java.util.Scanner;

public class Operation 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3,num,choice;
		while(true)
		{
			System.out.println("***** MENU *****");
			System.out.println("1]Greater number between 3\n2]Even or Odd\n3]Character is vowel or not\n4]Number is divisible by 5\n5]Exit\n");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: //find greater number between 3 numbers
					System.out.println("Enter first number: ");
					num1=sc.nextInt();
					System.out.println("Enter second number: ");
					num2=sc.nextInt();
					System.out.println("Enter third number: ");
					num3=sc.nextInt();
					
					if(num1>num2 && num1>num3)
					{
						System.out.println("Greater number is: "+num1);
					}
					else if(num2>num1 && num2>num3)
					{
						System.out.println("Greater number is: "+num2);
					}
					else if(num3>num2 && num3>num1)
					{
						System.out.println("Greater number is: "+num3);
					}
					else
						System.out.println("All three numbers are equal");
					break;
					
				case 2: //to check given number is even or odd
					System.out.println("Enter number: ");
					num1=sc.nextInt();
					
					if(num1%2==0)
						System.out.println("Number is even");
					else
						System.out.println("Number is odd");
					break;
					
				case 3: //to check given character is vowel or not
					System.out.println("Enter alphabet: ");
					char alphabet=sc.next().toLowerCase().charAt(0); //to convert uppercase letter into lowercase
					if(alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u')
						System.out.println("It is vowel");
					else
						System.out.println("It is consonant");
					break;
					
				case 4: //to check given number is divisible by 5 or not
					System.out.println("Enter number: ");
					num=sc.nextInt();
					if(num%5==0)
						System.out.println(num+" is divisible by 5");
					else
						System.out.println(num+" is not divisible by 5");
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Sorry! Please Enter Valid Choice");
			}
			System.out.println();
		}
	}

}
