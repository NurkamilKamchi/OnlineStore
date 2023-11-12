public class Book {
    private int id;
    private String name;
    private int price;
    private int publishedYear;
    private String authorName;
    public Book(){

    }
    public Book(int id, String name, int price, int publishedYear, String authorName){
        this.id=id;
        this.name=name;
        this.price=price;
        this.price=price;

    }

}



//Создайте класс Book(id, name, price, publishedYear, authorName)
//для представления книги и класс Library(id, name), который
//будет содержать массив объектов Book.(id для каждого объекта
//должен быть уникальным).Реализуйте методы в классе Library
//для:   добавления -> public void addBook(Book book){} ,
//поиска -> public Book getBook(int id){} ,
//обновления -> public Book updateBook(int id, Book newBook){},
//удаления -> public void deleteBookByName(int id){}
//и вывод на консоль все книги библиотеки ->
//public Book[] getAllLibraryBooks(int libraryId){}