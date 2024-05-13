package string;

import java.util.*;
public class String_Methods 
{
	String str;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		String_Methods sm=new String_Methods();
		sm.switchCase();
	}
	
	public void accept()
	{
		System.out.println("Enter String: ");
		sc.nextLine();
		str=sc.nextLine();
	}
	
	public void charat()
	{
		int ind;
		accept();
		
		System.out.println("Enter index: ");
		ind=sc.nextInt();
		
		//Returns the character at the specified index (position)
		System.out.println("Returned character is: "+(str.charAt(ind)));
	}
	
	public void compareto()
	{
		String str1;
		accept();
		System.out.println("Enter second string: ");
		str1=sc.nextLine();
		
		//Compares two strings lexicographically
		if(str.compareTo(str1)==0)
			System.out.println("Strings are equal");
		else
			System.out.println("String are not equal");
	}
	
	public void EqualString()
	{
		String str1;
		accept();
		System.out.println("Enter second string: ");
		str1=sc.nextLine();
		
		//Compares two strings. Returns true if the strings are equal, and false if not
		if(str.equals(str1)==true)
			System.out.println("Strings are equal");
		else
			System.out.println("String are not equal");
	}
	
	public void concatination()
	{
		String str1;
		accept();
		System.out.println("Enter second string: ");
		str1=sc.nextLine();
		
		//Appends a string to the end of another string
		System.out.println("Concatenated string is: "+str.concat(str1));
	}
	
	public void copyValue()
	{
		String str1;
		accept();
		
		//Returns a String that represents the characters of the character array
		str1=str.copyValueOf(str.toCharArray(),0,str.length());
		System.out.println("copied string is: "+str1);
	}
	
	public void stringLength()
	{
		int len;
		accept();
		//Returns the length of a specified string
		len=str.length();
		System.out.println("Length of String is: "+len);
	}
	
	public void string_isEmpty()
	{
		boolean result;
		accept();
		//Checks whether a string is empty or not
		result=str.isEmpty();
		System.out.println("Result is: "+result);
	}
	
	public void TolowerCase()
	{
		accept();
		//Converts a string to lower case letters
		System.out.println("converted string in lower case: "+str.toLowerCase());
	}
	
	public void ToupperCase()
	{
		accept();
		//Converts a string to upper case letters
		System.out.println("converted string in upper case: "+str.toUpperCase());
	}
	
	public void replaceString()
	{
		accept();
		char char1,char2;
		System.out.println("Which character you want to replace: ");
		char1=sc.next().charAt(0);
		System.out.println("By which character: ");
		char2=sc.next().charAt(0);
		
		//Searches a string for a specified value, and returns 
		//a new string where the specified values are replaced
		System.out.println("Modified string is: "+str.replace(char1, char2));
	}
	
	public void Indexof()
	{
		String str1;
		accept();
		System.out.println("Enter the sub string in the given string you want to find position: ");
		str1=sc.next();
		//Returns the position of the first found occurrence of specified characters in a string
		System.out.println("Position is: "+str.indexOf(str1));
	}
	
	public void EndsWith()
	{
		String str1;
		boolean result;
		accept();
		System.out.println("Enter the sub string in the given string you want to find position: ");
		str1=sc.next();
		//Checks whether a string ends with the specified character
		result=str.endsWith(str1);
		System.out.println("Result is: "+result);
	}
	
	public void hash_Code()
	{
		accept();
		//Returns the hash code of a string
		System.out.println("Hash code is: "+str.hashCode());
	}
	
	public void Trim()
	{
		accept();
		
		//Removes whitespace from both ends of a string
		System.out.println("Removed white space: "+str.trim());
	}
	
	public void tocharArray()
	{
		int i;
		accept();
		char[] char1=str.toCharArray();		//Converts a string to lower case letters
		System.out.println("String into character array: ");
		for(i=0;i<char1.length;i++)
			System.out.print(" "+char1[i]);
		System.out.println();
	}
	
	public void switchCase()
	{
		int choice;
		char yesno;
		do
		{
			System.out.println("String Methods");
			System.out.println("1]String Length\n2]String concat\n3]String replace\n4]TolowerCase()\n5]CompareTo\n6]CharAt\n7]copyValueOf\n8]Indexof\n9]equal()\n10]endsWith()\n11]hash_Code()\n12]ToupperCase()\n13]Remove white space(trim())\n14]tocharArray()\n15]isEmpty()\n16]compareto()\n17]EqualString()");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
					stringLength();
					break;
				case 2:
					concatination();
					break;
				case 3:
					replaceString();
					break;
				case 4: 
					TolowerCase();
					break;
				case 5:
					compareto();
					break;
				case 6:
					charat();
					break;
				case 7:
					copyValue();
					break;
				case 8:
					Indexof();
					break;
				case 9:
					EqualString();
					break;
				case 10:
					EndsWith();
					break;
				case 11:
					hash_Code();
					break;
				case 12:
					ToupperCase();
					break;
				case 13:
					Trim();
					break;
				case 14:
					tocharArray();
					break;
				case 15:
					string_isEmpty();
					break;
				case 16:
					compareto();
					break;
				case 17:
					EqualString();
					break;
				default:
					System.out.println("Enter valid choice");		
			}
			System.out.println("Do you want to check more methods?(y/n)");
			yesno=sc.next().charAt(0);
		}while(yesno=='y' || yesno=='Y');
	}
}
