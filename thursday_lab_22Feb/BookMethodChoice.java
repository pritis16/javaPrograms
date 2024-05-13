package thursday_lab_22Feb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

class BookMethodChoice 
{
    ArrayList<Book> bookList = new ArrayList<>();
    HashMap<Integer, String> bookAuthors = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void addBook() 
    {
        int num, i;

        System.out.println("How many books detail do you want to enter: ");
        num = getUserInput();

        System.out.println("Enter " + num + " book Detail");
        for (i = 0; i < num; i++) 
        {
            System.out.println("Enter book ID: ");
            int bookId = getUserInput();
            sc.nextLine();
            System.out.println("Enter book name: ");
            String bookName = sc.nextLine();
            System.out.println("Enter author name: ");
            String authorName = sc.nextLine();
            System.out.println("Enter book price: ");
            int price = getUserInput();

            Book book = new Book(bookId, bookName, authorName, price);
            bookList.add(book);
            bookAuthors.put(bookId, authorName);
        }
    }

    public void displayBooks() 
    {
        if (bookList.isEmpty()) 
        {
            System.out.println("No books available.");
        } 
        else 
        {
            System.out.println("---------------------------------------------");
            System.out.println("List of Books:");
            System.out.println("---------------------------------------------");
            System.out.println("ID\tBook Name\tAuthor Name\tPrice");
            System.out.println("---------------------------------------------");
            
            for (Book book : bookList) 
            {
                System.out.println(book.bookId + "\t" + book.bookName + "\t\t" + book.authorName + "\t\t" + book.price);
            }
            System.out.println("---------------------------------------------");
        }
    }

    public void updateBook() 
    {
    	int updateId;
        for (Book book : bookList) 
        {
    		// confirms you want to delete or not
            System.out.println("Do you want to update the book? (Y/N): ");
            char confirm = sc.next().charAt(0);
            if (confirm == 'Y' || confirm == 'y') 
            {
            	System.out.println("Enter book id you want to update: ");
            	updateId=sc.nextInt();
            	if(book.bookId == updateId)
            	{
	                sc.nextLine();
	                System.out.println("Enter book name: ");
	                book.bookName = sc.nextLine();
	                System.out.println("Enter author name: ");
	                book.authorName = sc.nextLine();
	                System.out.println("Enter book price: ");
	                book.price = getUserInput();
	                System.out.println("Book details updated successfully.");
            	}
            	else
            	{
            		System.out.println("Book with ID " + updateId + " not found.");
            	}
            } 
            else 
            {
                System.out.println("Book details remain unchanged.");
            }
            return;
        }
    }
    
    public void deleteBook(int id) 
    {
        for (int i = 0; i < bookList.size(); i++) 
        {
            if (bookList.get(i).bookId == id) 
            {
                System.out.println("Do you want to delete the book? (Y/N): ");
                char confirm = sc.next().charAt(0);
                if (confirm == 'Y' || confirm == 'y') 
                {
                    bookAuthors.remove(id);
                    bookList.remove(i);
                    System.out.println("Book deleted successfully.");
                } 
                else 
                {
                    System.out.println("Book remains in the list.");
                }
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    public void switchCase() 
    {
        int choice,id;

        while (true) 
        {
            System.out.println("Book Management");
            System.out.println("---------------------------------------------");
            System.out.println("1. Add Book\n2. View Book\n3. Update Book\n4. Delete Book\n5. Exit");
            System.out.println("---------------------------------------------");

            choice = getUserChoice();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:                   
                    updateBook();
                    break;
                case 4:
                	System.out.println("Enter book id you want to delete: ");
                    id = getUserInput();
                	deleteBook(id);
                	break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private int getUserInput() 
    {
        int input=0;
        boolean validInput = false;

        do {
            try {
                input = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // Clear the invalid input
            }
        } while (!validInput);

        return input;
    }

    private int getUserChoice() 
    {
        int choice=0;
        boolean validChoice = false;

        do {
            try {
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
                validChoice = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                sc.next(); // Clear the invalid input
            }
        } while (!validChoice);

        return choice;
    }
}
