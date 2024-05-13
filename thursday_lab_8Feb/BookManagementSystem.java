package thursday_lab_8Feb;

import java.util.*;

class BookManagementSystem {
    Scanner input = new Scanner(System.in);
    int bookId, availability, i;
    String book_name, author_name;
    static String libraryName = "My Library";
    double book_price;

    LinkedList<Integer> bookID = new LinkedList<>();
    LinkedList<String> BookName = new LinkedList<>();
    LinkedList<String> authorName = new LinkedList<>();
    LinkedList<Double> bookPrice = new LinkedList<>();
    LinkedList<Integer> bookAvailability = new LinkedList<>();

    public void createBook() {
        System.out.print("Enter book Id=");
        bookId = input.nextInt();
        bookID.add(bookId);
        input.nextLine();
        System.out.print("Enter book name= ");
        book_name = input.nextLine();
        BookName.add(book_name);

        System.out.print("Enter author name= ");
        author_name = input.nextLine();
        authorName.add(author_name);

        System.out.print("Enter book price=");
        book_price = input.nextDouble();
        bookPrice.add(book_price);

        System.out.print("Enter book availability=");
        availability = input.nextInt();
        bookAvailability.add(availability);
    }

    public void deleteBook() 
    {
        int Id;
        System.out.print("Enter book Id for delete book=");
        Id = input.nextInt();

        if (!bookID.isEmpty()) 
        {
            for (i = 0; i < BookName.size(); i++) {
                if (Id == bookID.get(i)) {
                    bookID.remove(i);
                    BookName.remove(i);
                    authorName.remove(i);
                    bookPrice.remove(i);
                    bookAvailability.remove(i);
                    System.out.println("Book deleted successfully!");
                    break;
                }
            }
        } 
        else 
        {
            System.out.println("No books available in " + libraryName);
        }
    }

    public void displayBook() 
    {
        Iterator<Integer> idDisplay = bookID.iterator();
        Iterator<String> nameDisplay = BookName.iterator();
        Iterator<String> authorDisplay = authorName.iterator();
        Iterator<Double> priceDisplay = bookPrice.iterator();
        Iterator<Integer> availabilityDisplay = bookAvailability.iterator();

        if (!BookName.isEmpty()) {
            while (idDisplay.hasNext() && nameDisplay.hasNext() && authorDisplay.hasNext() &&
                    priceDisplay.hasNext() && availabilityDisplay.hasNext()) {
                System.out.println("ID:" + idDisplay.next());
                System.out.println("NAME:" + nameDisplay.next());
                System.out.println("AUTHOR:" + authorDisplay.next());
                System.out.println("PRICE:" + priceDisplay.next());
                System.out.println("AVAILABILITY:" + availabilityDisplay.next());
                System.out.println("-----------------------------");
            }
        }
    }
}
