/*Write a java program to accept a number from the user and find the square
 if number is positive and less than 20 */

package ConditionalStatement;
import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		int num,square=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		
		if(num>0 && num<20)
		{
			square=num*num;
			System.out.println("Square of "+num+" : "+square);
		}
		else
			System.out.println("Kindly enter only positive number and the number should be less than 20");
		
		sc.close();
	}

}
