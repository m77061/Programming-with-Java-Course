package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return this.name;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        Customer customerToRemove = null;

        for (Customer c : this.customers) {
            if (c.getId() == customer.getId()) {
                customerToRemove = c;
            }
        }

        if (customerToRemove == null) {
            String exceptionMessage = String.format("Customer with ID = %d was not found!", customer.getId());
            throw new IllegalArgumentException(exceptionMessage);
        }

        this.customers.remove(customerToRemove);
    }
}
