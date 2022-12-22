package task_1.employees;

import task_1.User;
import task_1.interfaces.iLibrarian;

public class Librarian extends User implements iLibrarian {
    public Librarian(String name) {
        super(name);
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Библиотекарь " + getName() + " заказывает книгу у поставщика " + supplier.getName());
    }
}
