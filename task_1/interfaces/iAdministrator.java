package task_1.interfaces;

import task_1.Book;
import task_1.employees.Reader;

public interface iAdministrator {
    void overdueNotification(Reader reader);
    void findBook(Book book);
}
