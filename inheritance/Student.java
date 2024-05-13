/*Q5)Create a parent class called "Person" with attributes such as name, age,
 and a method called "speak". Create a child class called "Student" that 
 inherits from Person and has an additional attribute called "grade" and a 
 method called "study". Create an object of the Student class and call both 
 the "speak" and "study" methods.*/

package inheritance;
import java.util.Scanner;
class Person
{
	String name;
	int age;
	Scanner sc=new Scanner(System.in);
	public void speak()
	{
		System.out.println("Enter name: ");
		name=sc.next();
		System.out.println("Enter age: ");
		age=sc.nextInt();
	}
}
class Student extends Person 
{
	char grade;
	public void study()
	{
		System.out.println("Enter grade: ");
		grade=sc.next().charAt(0);
		display();
	}
	public void display()
	{
		System.out.println("Name\tAge\tGrade");
		System.out.println("------------------------------------------");
		System.out.println(name+"\t"+age+"\t"+grade);
	}
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.speak();
		s.study();
	}

}
