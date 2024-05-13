/* Q4)WAP to enter any sentence and calculate the following:
  a) Total number of digits present in it.
  b) Total number of small letters and capital letters present in it.
  c) Total number of alphabets used in it.
  d) Total number of special character used in it.
  e) Total number of vowels presents in it.
  f) Total Number words present in that sentence.
  */

package thursday_lab_25_01;

import java.util.Scanner;

public class SentenceAnalyzer 
{
	static String sentence;
	static char character;
	static int i;
    public static void main(String[] args) 
    {
       
        accept();
    }
    
    public static void accept()
    {
    	 Scanner scanner = new Scanner(System.in);

         System.out.println("Enter a sentence:");
         sentence = scanner.nextLine();
         
         countDigits(sentence);
         letterCount(sentence);
         countSpecialCharacters(sentence);
         countVowels(sentence);
         int wordCount = countWords(sentence);
         System.out.println("Total number of words: " + wordCount);
         
         scanner.close();
    }
    public static void countDigits(String sentence) 
    {
    	// Task (a): Total number of digits
        int digitCount = 0;
        for (i=0;i<sentence.length();i++) 
        {
        	character=sentence.charAt(i);
            if (Character.isDigit(character)) 
            {
                digitCount++;
            }
        }
        System.out.println("Total number of digits: " + digitCount);
    }

    public static void letterCount(String sentence) 
    {
        int smallLetterCount = 0,capitalLetterCount=0,totalAlphabets;
        
        for (i=0;i<sentence.length();i++) 
        {
        	character=sentence.charAt(i);
        	// Task (b): Total number of small letters and capital letters
        	if (character>='A' && character<='Z')
            {
            	capitalLetterCount++;
            }
            else if (character>='a' && character<='z')
            {
            	smallLetterCount++;
            }
        }
        
        System.out.println("Total number of small letters: " + smallLetterCount);
        
        System.out.println("Total number of capital letters: " + capitalLetterCount);
        
        // Task (c): Total number of alphabets use
        totalAlphabets=smallLetterCount+capitalLetterCount;
        System.out.println("Total number of alphabets: " + totalAlphabets);

    }
    
    public static void countSpecialCharacters(String sentence) 
    {
        int specialCharacterCount = 0;
        
     // Task (d): Total number of special characters
        for (i=0;i<sentence.length();i++) 
        {
        	character=sentence.charAt(i);
            if (!Character.isLetterOrDigit(character)) 
            {
                specialCharacterCount++;
            }
        }
        
        System.out.println("Total number of special characters: " + specialCharacterCount);
    }

    public static void countVowels(String sentence) 
    {
        int vowelCount = 0;
        
     // Task (e): Total number of vowels
        String vowels = "aeiouAEIOU";

        for (i=0;i<sentence.length();i++) 
        {
        	character=sentence.charAt(i);
            if (vowels.indexOf(character) != -1) 
            {
                vowelCount++;
            }
        }
        
        System.out.println("Total number of vowels: " + vowelCount);
    }

    public static int countWords(String sentence) 
    {
    // Task (f): Total number of words
       String[] words = sentence.split("\\s+");
       return words.length;
    }
}