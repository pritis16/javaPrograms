/* Q2)Create a Book class to store Books information(bookid, title,
 *  author name, price).Create an object and assign values to Book 
 *  variables and print them using a method.For printing use the 
 *  bookid if the book is available so display the details and if 
 *  book is not available show the msg by using exception
 */

package thursday_lab_25_01;

import java.util.*;
public class Book 
{
	ArrayList<Integer> bookID=new ArrayList<>();
	ArrayList<Integer> bookprice=new ArrayList<>();
	ArrayList<String> author_name=new ArrayList<>();
	ArrayList<String> booktitle=new ArrayList<>();
	
	int num,i;
	Scanner sc=new Scanner(System.in);
	
	public void acceptBookDetails()
	{
		int bookid,price;
		String authorname,title;
		
		System.out.println("How many books you want: ");
		num=sc.nextInt();
		
		for(i=0;i<num;i++)
		{
			System.out.println("Enter "+(i+1)+" book detail");
			System.out.println("Enter book id: ");
			bookid=sc.nextInt();
			System.out.println("Enter book title: "+sc.nextLine());
			title=sc.nextLine();
			System.out.println("Enter author name: ");
			authorname=sc.nextLine();
			System.out.println("Enter book price: ");
			price=sc.nextInt();
			
			bookID.add(bookid);
			booktitle.add(title);
			author_name.add(authorname);
			bookprice.add(price);
		}
	}
	
	public void displayBookDetails()
	{
		System.out.println("Available Books: ");
		System.out.println("-------------------------------------------------");
		for(i=0;i<num;i++)
		{
			System.out.println((i + 1) + ". Book ID: " + bookID.get(i) + "\n Book Title: " + booktitle.get(i) + "\n Author Name: "+author_name.get(i)+"\n Book Price: "+bookprice.get(i));
			System.out.println("-------------------------------------------------");
		}
	}
	
	public void printBookDetails(int requestedBook) throws Exception
	{
		boolean bookFound=false;
		
		for(i=0;i<bookID.size();i++)
		{
			
			if(requestedBook==bookID.get(i))
			{
				bookFound=true;
				System.out.println("Book is found\nBook detail is: ");
				System.out.println(" Book ID: " + bookID.get(i) + "\n Book Title: " + booktitle.get(i) + "\n Author Name: "+author_name.get(i)+"\n Book Price: "+bookprice.get(i));
			}	
		}
		
		if(!bookFound)
			throw new Exception();
	}
	
	public static void main(String[] args)  
	{
		int requestedBook;
		Scanner sc=new Scanner(System.in);
		Book book=new Book();
		book.acceptBookDetails();
		book.displayBookDetails();
		try
		{
			System.out.println("Which book you want? Please Enter book ID: ");
			requestedBook=sc.nextInt();
			book.printBookDetails(requestedBook);
		}
		catch(Exception e)
		{
			System.out.println("Book is not available");
		}
	}
}
