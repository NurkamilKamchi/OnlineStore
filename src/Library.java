import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    private int id;
    private String name;
    private List<Book>books;

    public Library(){

    }
    public Library(int id,String name){
        this.id=id;
        this.name=name;
        this.books=new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
