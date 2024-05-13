/* Have the function PowersofTwo(num) take the num parameter being 
 * passed which will be an integer and return the string true if it 
 * a power of two. If it's not return the string false. For example 
 * if the input is 16 then your program should return the string 
 * true but if the input is 22 then the output should be the string
 * false.
 */

package _6th_feb_2024;
import java.util.*;
public class PowersOfTwo 
{
	public static String powersOfTwo(int num)
	{
		while (num > 1) 
		{
            if (num % 2 != 0) 
            {
                return "false";
            }
           num /= 2;
        }

        return "true";
		
	}
	public static void main(String[] args) 
	{
		int num;
		String result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		num=sc.nextInt();
		
		result=powersOfTwo(num);
		System.out.println("Reuslt is: "+result);
	}

}
