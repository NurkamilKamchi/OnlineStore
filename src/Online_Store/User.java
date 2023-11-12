package Online_Store;

import java.util.Arrays;
import java.util.Scanner;

public class User {
    private String firstname;
    private String lastName;
    private String email;
    private String password;
    private Product[] products = new Product[100];
    private int lastProductIndex = 0;


    public User() {

    }

    public User(String firstname, String lastName, String email, String password, Product[] products) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.products = products;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return "User{" + "firstname='" + firstname + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' + ", products='" + products + '\'' + '}';
    }

    public static User[] users = new User[100];
    private static User currentUser;

    private static int usersIndex = 0;

    public static String HeadWords() {
        return """
                1.🟢Register.
                2.🟡Login.
                3.🔴Exit.                    
                """;
    }

    public static String HeadWordsAfterLogin() {
        return """
                1.🟡Logout.
                2.🟡Add new product.
                3.🟡Get all Products.
                4.🟡Get all Book.
                5.🟡Get all Electronics.           
                """;
    }


    public static void Registry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Firstname :");
        String firstname = scanner.nextLine();
        System.out.println("Lastname: ");
        String lastname = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        System.out.println("✅Succesfully registred!!!");
        users[usersIndex] = new User(firstname, lastname, email, password, null);
        usersIndex++;
    }


    public static void Login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        for (int i = 0; i < usersIndex; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)) {
                System.out.println("Welcome,🙌 " + users[i].firstname);
                Product[] product = new Product[100];
                currentUser = users[i];
                loginMenu(product);
                return;
            }
        }
        System.out.println("Uncorrect email or password!");
    }

    private static void loginMenu(Product[] products) {
        int count = 0;
        Book book = new Book();
        Electronics electronics = new Electronics();

        while (true) {
            System.out.println(User.HeadWordsAfterLogin());
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("logout") || choice.equalsIgnoreCase("1")) {
                break;


            } else if (choice.equalsIgnoreCase("Add new product") || choice.equalsIgnoreCase("2")) {
                System.out.println("Enter your choice (books or electronics): ");
                String choiceForAdding = new Scanner(System.in).nextLine();
                if (choiceForAdding.equalsIgnoreCase("books") || choiceForAdding.equalsIgnoreCase("1")) {
                    Book.addElement(book);
                } else if (choiceForAdding.equalsIgnoreCase("electronics") || choiceForAdding.equalsIgnoreCase("2")) {
                    Electronics.Electronics(electronics);
                }

            } else if (choice.equalsIgnoreCase("Get all product") || choice.equalsIgnoreCase("3")) {

//                if (choice.equalsIgnoreCase("books") || choice.equals("1")) {
//                   getAllProducts();
                    for (int i = 0; i < Book.booksIndex; i++) {
                        System.out.println("Book #"+i);
                        System.out.println(Book.getBooks()[i]);
                        System.out.println("-------------------------------------------------------------------------------------------");
                    }
//                }
                for (int i = 0; i <Electronics.electronicsIndex ; i++) {
                    System.out.println("Electronnic #"+i+1);
                    System.out.println(Electronics.getElectronics()[i]);
                    System.out.println("--------------------------------------------------------------------------------------------");
                }
            }
//                }
            else if (choice.equalsIgnoreCase("Get all book") || choice.equalsIgnoreCase("4")) {

                for (int i = 0; i < Book.booksIndex; i++) {
                    System.out.println("Book #"+i);
                    System.out.println(Book.getBooks()[i]);
                    System.out.println("-------------------------------------------------------------------------------------------");
                }



            } else if (choice.equalsIgnoreCase("Get all electronics") || choice.equalsIgnoreCase("5")) {
                for (int i = 0; i <Electronics.electronicsIndex ; i++) {
                    System.out.println("Electronnic #"+i+1);
                    System.out.println(Electronics.getElectronics()[i]);
                    System.out.println("--------------------------------------------------------------------------------------------");
                }
            }

        }

    }
//    public static void getAllProducts(){
//        for (int i = 0; i < Book.booksIndex; i++) {
//            System.out.println("Book #"+i);
//            System.out.println(Book.getBooks()[i]);
//            System.out.println("-------------------------------------------------------------------------------------------");
//        }
//        for (int i = 0; i <Electronics.electronicsIndex ; i++) {
//            System.out.println("Electronnic #"+i+1);
//            System.out.println(Electronics.getElectronics()[i]);
//            System.out.println("--------------------------------------------------------------------------------------------");
//        }
//    }





    public static void Exit() {
        System.exit(0);
    }
}





