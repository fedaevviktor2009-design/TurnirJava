public class People {
    private String name, surname;
    private int birthYear;

    public People(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public void getInfo(){
        System.out.println(name + " " + surname + " " + birthYear + " года рождения");
    }

    public void getMessage(Book book, Car car){
        System.out.println(this.getName() + " читает книгу \"" + book.getName() + "\" про машину " + car.getBrand());
    }

    public String getName() {
        return name;
    }
}
