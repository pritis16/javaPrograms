/* Write a method that takes a String and returns a String of the same length containing the
 * 'X' character in all positions except the last 4 positions. The characters in the last 4 
 * positions must be the same as in the original string. For example, if the argument is
 * "12345678", the return value should be "XXXX5678".
 */

package thursday_lab_8Feb;
import java.util.*;

public class StringReplaceWithX {
	String string;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter the number: ");
	    string=sc.next();
	    System.out.println(makeNumber(string));
	}
	public String makeNumber(String num)
	{
		 if (num == null || num.length() < 4) 
		 {
	         return num;
	     }
	        int length = num.length();
	        String change= "X".repeat(length - 4) + num.substring(length - 4);
	        return change;
	}
	public static void main(String[] args)
	{
		StringReplaceWithX nr=new StringReplaceWithX();
		nr.accept();
		
	}

}