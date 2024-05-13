/* 
 * Create a arraylist of students name and remove name of students who start with ‘S’ using 
 * lambda expression.
 */

package thursday_lab_15feb;
import java.util.*;
public class Que3 
{
	ArrayList<String> students=new ArrayList<>();
	String name;
	public void removeNameStartWith_S()
	{
		int num,i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many students you want: ");
		num=sc.nextInt();
		
		for(i=0;i<num;i++)
		{
			System.out.println("Enter student name: ");
			name=sc.next();
			
			students.add(name);
		}
		
		System.out.println("Original Student Names:");
        for (String name : students) {
            System.out.println(name);
        }
        System.out.println();
		
		students.removeIf(name -> name.startsWith("S") || name.startsWith("s"));
		
		System.out.println("Updated Student Names:");
        for (String name : students) {
            System.out.println(name);
        }
	}
	
	public static void main(String[] args)
	{
		Que3 obj=new Que3();
		obj.removeNameStartWith_S();
	}
}
