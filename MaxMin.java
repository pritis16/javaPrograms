import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  //accept number from user
		int min,max,i;
		
		System.out.println("Enter Minimum number: ");
		min=sc.nextInt();
		System.out.println("Enter Maximum number: ");
		max=sc.nextInt();
		
		System.out.println("Minimum number: "+min);
		System.out.println("Maximum number: "+max);
		System.out.println("Even Number: ");
		for(i=min;i<=max;i++)
		{
			if(i%2==0)   //to check no is even
				System.out.print("\t"+i);
		}
		System.out.println();
		
		System.out.println("Odd Number: ");
		for(i=min;i<=max;i++)
		{
			if(i%2!=0)   //to check no is odd
				System.out.print("\t"+i);
		}
	}

}
