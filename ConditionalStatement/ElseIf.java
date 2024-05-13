/*Write a java program to find out profit and loss*/

package ConditionalStatement;
import java.util.*;

public class ElseIf {

	public static void main(String[] args) {
		int cost_price,selling_price,result;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter selling price: ");
		selling_price=sc.nextInt();
		
		System.out.println("Enter cost price: ");
		cost_price=sc.nextInt();
		
		result=selling_price-cost_price;
		if(result==0)
		{
			System.out.println("Neither profit nor loss");
		}
		else if(result>0)
		{
			System.out.println("the profit is: "+result);
		}
		else
		{
			System.out.println("the loss is: "+(-result));
		}
		sc.close();
	}

}