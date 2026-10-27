public class Book {
    private String author, name;
    private int manufactureYear;

    public Book(String author, String name, int manufactureYear) {
        this.author = author;
        this.name = name;
        this.manufactureYear = manufactureYear;
    }

    public void getInfo() {
        System.out.println(author + " \"" + name + "\" " + manufactureYear + " года выпуска");
    }

    public String getName() {
        return name;
    }
}
