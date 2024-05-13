/*Q6)Write a program in Java to enter a String/Sentence and display
    the longest word and the length of the longest word present in
    the String.
 */

package thursday_lab_25_01;

import java.util.Scanner;

public class LongestString 
{
	public static void displayLongestString()
	{
		String sentence,words = "",longWord="";
		int i;
		char character;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string: ");
		sentence=sc.nextLine();
		sentence+=" ";		//add space after end of the string
		
		for (i = 0; i < sentence.length(); i++) {
	           character = sentence.charAt(i);
	           if (character == ' ') {
	               
	                if (words.length() > longWord.length())
	                    longWord = words;
	                    
	                words = "";
	           }
	           else {
	               words += character;
	           }
	       }
		 // Display the result
        System.out.println("Longest word: " + longWord);
        System.out.println("Length of the longest word: " + (longWord.length()));

        sc.close();
    }
	
	public static void main(String[] args) 
	{
		displayLongestString();
	}

}
