package Online_Store;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Product {
    private String name;
    private String description;
    private BigDecimal price;
    private String createdAt;

    public Product(){

    }
    public Product (String name,String description,BigDecimal price, String createdAt){
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return
                "\n" + "Name: " + name + '\'' + "\n" +
                        "Description: " + description + '\'' + "\n" +
                        "Price: " + price + "\n" +
                        "CreatedAt: " + createdAt + '\'';
    }
}




//    Product деген класс туз. Полелери (name, description, price, createdAt).
//        Product классын мурастаган эки класс тузунуз.
//        Electronics полелери(brand, color, isNew, memory).
//        Book полелери(authorFullName).
//        Андан сырткары дагы бир User деген класс туз.
//        Полелери (firstName, lastName, email, password, products
//Сайтты колдонуу үчүн, биринчи колдонуучу (User) катталуусу керек.
//Төмөндөгү командалар болсун:
//1. Каттоо. Register
//2. Кирүү Login
//3. Чыгyy. Exit