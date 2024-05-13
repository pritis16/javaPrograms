/*Q5) Write a program in Java to accept a word/a String and display 
 * the new string after removing all the vowels present in it.
 */

package thursday_lab_25_01;
import java.util.Scanner;

public class RemoveVowels 
{
	public static void removeVowel()
	{
		String str,vowels="aeiouAEIOU";
		int i;
		char character;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string: ");
		str=sc.nextLine();
		
		for(i=0;i<str.length();i++)
		{
			character=str.charAt(i);
			if(vowels.indexOf(character) != -1)
			{
				continue;
			}
			else
				System.out.print(character);
		}
	}
	public static void main(String[] args) 
	{
		removeVowel();
	}

}
