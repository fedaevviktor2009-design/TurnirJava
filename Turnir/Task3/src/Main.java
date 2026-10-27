void main() {
    Book book = new Book("Генри Форд", "Моя жизнь, мои достижения", 1922);
    Car car = new Car("Ford", 1908, 2.9);
    People people = new People("Иван", "Иванов", 2000);
    book.getInfo();
    car.getInfo();
    people.getInfo();
    people.getMessage(book, car);
}
