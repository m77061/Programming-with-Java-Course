import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Store {
    private String name;
    private ArrayList<String> products;
    private ArrayList<Employee> employees;

    public Store(String name) {
        this.setName(name);
        this.products = new ArrayList<String>();
        this.employees = new ArrayList<Employee>();
    }

    public Store(String name, ArrayList<Employee> employees) {
        this(name);
        this.employees = employees;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(this.employees);
    }

    public void add(String product) {
        this.products.add(product);
    }

    public List<String> getProducts() {
        return Collections.unmodifiableList(this.products);
    }
}
