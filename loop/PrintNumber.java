package loop;

import java.util.Scanner;
public class PrintNumber {

	public static void main(String[] args) {
		int startpoint,endpoint,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start number: ");
		startpoint=sc.nextInt();
		System.out.println("Enter the end number: ");
		endpoint=sc.nextInt();
		
		for(i=startpoint;i<=endpoint;i++)
		{
			System.out.println(i);
		}
	}

}
