package Online_Store;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Book extends Product {
    private String authorName;

    public Book() {

    }

    public Book(String name, String description, BigDecimal price, String createdAt, String authorName) {
        super(name, description, price, createdAt);
        this.authorName = authorName;
    }


    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book: " +"\n"+
                "author name: " + authorName + '\'' +
                 super.toString();
    }

    private static Book[] books = new Book[20];
    private static int booksIndex=0;

    public static void addElement(Book book) {
        while (true) {
            System.out.print("enter name: ");
            String name = new Scanner(System.in).nextLine();
            book.setName(name);
            if (name.isEmpty()) {
                System.out.println("Your blank is empty, please try again!!!");
                return;
            }
            System.out.println("enter description: ");
            String description = new Scanner(System.in).nextLine();
            book.setDescription(description);
            if (description.isEmpty()) {
                System.out.println("Your blank for description is emty, please try again!!!");
                return;
            }
            System.out.println("enter price: ");
            BigDecimal price = new Scanner(System.in).nextBigDecimal();
            book.setPrice(price);
            if (price.equals(0)) {
                System.out.println("Invalid price!!!");
            }
            System.out.println("Enter created place: ");
            String createdAt = new Scanner(System.in).nextLine();
            book.setCreatedAt(createdAt);
            if (createdAt.isEmpty()){
                System.out.println("Invalid created place,please try again!!!");
                return;
            }
            System.out.println("Enter author name:");
            String authorName = new Scanner(System.in).nextLine();
            book.setAuthorName(authorName);
            if (authorName.isEmpty()){
                System.out.println("Invalid author name,please try again!!!");
                return;
            }
            books[booksIndex]=new Book(name,description,price,createdAt,authorName);
            System.out.println("Successfully added!!!");
            System.out.println( books[booksIndex]);
            booksIndex++;
            return;

        }




    }


}
