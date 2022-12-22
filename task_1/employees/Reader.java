package task_1.employees;

import task_1.Book;
import task_1.User;
import task_1.interfaces.iReader;

public class Reader extends User implements iReader {
    public Reader(String name) {
        super(name);
    }

    @Override
    public void takeBook(Book book) {
        System.out.println("Читатель " + getName() + " взял книгу " + book.getName());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Читатель " + getName() + " возвращает книгу " + book.getName());
    }
}
