/*Write a java program to accept length and breadth from the user and find 
 out area of rectangle and perimeter of rectangle*/

import java.util.Scanner;

public class Rectangle 
{
	public static void main(String[] args) 
	{
		double length,breadth,rectarea,rect_perimeter;
		Scanner sc=new Scanner(System.in); //Accept the values from the user
		
		System.out.println("Enter the length of the rectangle: ");
		length=sc.nextDouble(); //Accept the length from the user
		
		System.out.println("Enter the breadth of the rectangle: ");
		breadth=sc.nextDouble();  //Accept the breadth from the user
		
		rectarea=length*breadth;	//calculate the area of rectangle
		System.out.println("Area of Rectangle: "+rectarea);
		
		rect_perimeter=2*(length+breadth);//calculate the perimeter of rectangle
		System.out.println("Perimeter of Rectangle: "+rect_perimeter);
		sc.close();
	}

}
