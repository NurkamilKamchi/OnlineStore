import Online_Store.Book;
import Online_Store.User;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        while (true) {




            System.out.println(User.HeadWords());
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("register" ) || choice.equalsIgnoreCase("1")) {
                User.Registry();
            } else if (choice.equalsIgnoreCase("login") || choice.equalsIgnoreCase("2")) {
                User.Login();
//                User.
            } else if (choice.equalsIgnoreCase("exit") || choice.equalsIgnoreCase("3")) {
                User.Exit();
            }else {
                System.out.println("Invalid choice.Try again!");
            }
        }


}}



//. Сайтты колдонуу үчүн, биринчи колдонуучу (User) катталуусу керек.
//        Төмөндөгү командалар болсун:
//        1. Каттоо. Register
//        2. Кирүү Login
//        3. Чыгyy. Exit
//        3. Колдонуучу катталгандан кийин Login команда аркылу кирип,
//        төмөнкү функцияларды аткара алсын:
//        0. Logout Чыгуу
//        1. Add new Product Жаңы продукт кошуңуз
//        2. Get all Products Бардык продукталарды алыңыз
//        3. Get all Book Бардык китепти алыңыз
//        4. Get all Electronics Бардык электроникаларды алыңыз
//        4. Exit команда программаны токтотсун.
//        Deadline(Мөөнөтү): 10.11.2023 11:00











