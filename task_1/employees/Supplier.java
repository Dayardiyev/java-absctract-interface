package task_1.employees;

import task_1.User;
import task_1.interfaces.iSupplier;

public class Supplier extends User implements iSupplier {
    public Supplier(String name) {
        super(name);
    }

    @Override
    public void bringBook(Librarian librarian) {
        System.out.println("Поставщик " + getName() + " доставляет заказ библиотекарю " + librarian.getName());
    }
}
