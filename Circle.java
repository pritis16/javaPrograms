/*Write a java program to accept radius from the user and find 
 out area of circle and circumference of circle*/

import java.util.Scanner;

public class Circle 
{

	public static void main(String[] args)
	{
		double radius,circarea,circumference,PI=3.142;
		Scanner sc=new Scanner(System.in); //Accept the values from the user
		System.out.println("Enter the radius of the circle: ");
		radius=sc.nextDouble(); //Accept the radius from the user
	
		circarea=PI*radius*radius;	//calculate the area of circle
		System.out.println("Area of Circle: "+circarea);
		
		circumference=2*PI*radius;//calculate the circumference of circle
		System.out.println("Circumference of Circle: "+circumference);
		sc.close();
	}

}
