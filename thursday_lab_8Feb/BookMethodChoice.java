package thursday_lab_8Feb;

class BookMethodChoice extends BookManagementSystem {
    public void choices() 
    {
        int choice;
        do {
            System.out.print("**** Operations ****\n"
                    + "1) Insert book\n"
                    + "2) Delete book\n"
                    + "3) Display book\n"
                    + "4) Exit"
                    + "\nEnter your choice=");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    createBook();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    displayBook();
                    break;
                case 4:
                	System.out.println("Exiting Book Management System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Enter your choice again.");
            }
        } while (true);
    }
}
