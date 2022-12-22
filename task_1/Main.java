package task_1;

import task_1.employees.Administrator;
import task_1.employees.Librarian;
import task_1.employees.Reader;
import task_1.employees.Supplier;
import task_1.interfaces.iAdministrator;
import task_1.interfaces.iReader;
import task_1.interfaces.iLibrarian;
import task_1.interfaces.iSupplier;

public class Main {
    public static void main(String[] args) {
        iAdministrator administrator = new Administrator("Вася");
        iReader reader = new Reader("Ден");

        Book book = new Book("Властелин колец");

        administrator.overdueNotification((Reader) reader);
        administrator.findBook(book);


        reader.takeBook(book);
        reader.returnBook(book);


        iLibrarian librarian = new Librarian("Александр");
        iSupplier supplier = new Supplier("Расул");
        librarian.orderBook((Supplier) supplier);
        supplier.bringBook((Librarian) librarian);

    }
}
