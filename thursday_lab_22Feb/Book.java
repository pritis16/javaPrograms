package thursday_lab_22Feb;

class Book {
    int bookId, price;
    String bookName, authorName;

    public Book(int bookId, String bookName, String authorName, int price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }
}