void main() {
    Reader[] readers = new Reader[5];
    readers[0] = new Reader("Иванов И. И.", "программирование", "+7 800 555 3636", 0, new Date(1000000));
    readers[1] = new Reader("Сидоров И. С.", "философия", "+7 700 555 3636", 1, new Date(100000));
    readers[2] = new Reader("Сидоров И. И.", "инжинерия", "+7 710 555 3636", 2, new Date(200000));
    readers[3] = new Reader("Сидоров С. С.", "инжинерия", "+7 700 555 3636", 3, new Date(300000));
    readers[4] = new Reader("Сидоров С. И.", "философия", "+7 700 555 3636", 4, new Date(400000));

    readers[0].takeBook(4);
    readers[1].takeBook("Приключения", "Энциклопедия", "Словарь");
    readers[2].returnBook(2);
    readers[3].returnBook("Учебник", "Рукопись");
    readers[4].returnBook(3);
}
