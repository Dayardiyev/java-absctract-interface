package task_1.employees;


import task_1.Book;
import task_1.User;
import task_1.interfaces.iAdministrator;

public class Administrator extends User implements iAdministrator {
    public Administrator(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + getName() + " уведомил читателя - " + reader.getName());
    }

    @Override
    public void findBook(Book book) {
        System.out.println("Администратор " + getName() + " нашел книгу " + book.getName());
    }
}
