package thursday_lab_22Feb;

//Write an application to create a book management system to do the 
//following process :
// Add book
// Update book
// Delete book
//add author to each by using collection framework.

public class BookManagementSystem 
{
    public static void main(String[] args) 
    {
        BookMethodChoice book = new BookMethodChoice();
        book.switchCase();
    }
}