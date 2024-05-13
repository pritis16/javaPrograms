/* Have the function ABCheck(str) take the str parameter being 
 * passed and return the string true if the characters a and b are 
 * separated by exactly 3 places anywhere in the string at least 
 * once (ie. "lane borrowed" would result in true because there is 
 * exactly three characters between a and b). Otherwise return the 
 * string false.
 */

package _6th_feb_2024;

import java.util.Scanner;
public class StringCheck 
{
    public static void main(String[] args) 
    {
    	String string,result;
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter string you want to check: ");
        string=sc.nextLine();
        result=ABCheck(string);
        System.out.println("Result is: "+result);
    }

    static String ABCheck(String str) 
    {
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == 'a') 
            {
                if ((i + 4) < str.length() && str.charAt(i + 4) == 'b') 
                {
                    return "true";
                }
            }
        }
        return "false";
    }
}
