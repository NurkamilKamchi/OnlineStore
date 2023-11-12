package Online_Store;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Electronics extends Product {
    private String color;
    private String brand;
    private String isNew;
    private int memory;

    public Electronics (String name, String description, BigDecimal price, String createdAt) {
//      this.getName();
//      this.getDescription();
//      this.getPrice();
//      this.getCreatedAt();
    }

    public Electronics() {

    }

    public Electronics(String name, String description, BigDecimal price, String createdAt, String color, String brand, String isNew, int memory) {
        super(name, description, price, createdAt);
        this.color = color;
        this.brand = brand;
        this.isNew = isNew;
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", isNew='" + isNew + '\'' +
                ", memory=" + memory +
                "} " + super.toString();
    }

    private static  Electronics[] electronics = new Electronics[20];

    private static int electronicsIndex = 0;

    public static void Electronics(Electronics electronic) {
        while (true) {
            System.out.print("enter name: ");
            String name = new Scanner(System.in).nextLine();
            electronic.setName(name);
            if (name.isEmpty()) {
                System.out.println("Your blank is empty, please try again!!!");
                return;
            }
            System.out.println("enter description: ");
            String description = new Scanner(System.in).nextLine();
            electronic.setDescription(description);
            if (description.isEmpty()) {
                System.out.println("Your blank for description is emty, please try again!!!");
                return;
            }
            System.out.println("enter price: ");
            BigDecimal price = new Scanner(System.in).nextBigDecimal();
            electronic.setPrice(price);
            if (price==null) {
                System.out.println("Invalid price!!!");
            }
            System.out.println("Enter created place: ");
            String createdAt = new Scanner(System.in).nextLine();
            electronic.setCreatedAt(createdAt);
            if (createdAt.isEmpty()) {
                System.out.println("Invalid created place,please try again!!!");
                return;
            }
            System.out.println("Enter color: ");
            String color = new Scanner(System.in).nextLine();
            electronic.setColor(color);
            if (color.isEmpty()) {
                System.out.println("Invalid author color,please try again!!!");
                return;
            }
            System.out.println("Enter brand: ");
            String brand = new Scanner(System.in).nextLine();
            electronic.setBrand(brand);
            if (brand.isEmpty()) {
                System.out.println("Invalid author brand,please try again!!!");
                return;
            }
            System.out.println("Is new? ");
            String isNew = new Scanner(System.in).nextLine();
            electronic.setIsNew(isNew);
            if (isNew.isEmpty()) {
                System.out.println("Invalid answer,please try again!!!");
                return;
            }
            System.out.println("Enter memory: ");
            int memory = new Scanner(System.in).nextInt();
            electronic.setMemory(memory);
            if (memory == 0) {
                System.out.println("Invalid memory,please try again!!!");
                return;
            }
            electronics[electronicsIndex] = new Electronics(name, description, price, createdAt, color, brand, isNew, memory);
            System.out.println("Successfully added!!!");
            System.out.println(electronics[electronicsIndex]);
            electronicsIndex++;
            return;

        }


    }
}
