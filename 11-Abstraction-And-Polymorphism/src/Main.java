import zoo.*;
import bank.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        //testZoo();
        testBank();
    }

    private static void testZoo() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();

        Zoo zoo = new Zoo();
        zoo.addAnimal(cat);
        zoo.addAnimal(dog);
        zoo.addAnimal(bird);

        zoo.feedAnimals();
    }

    private static void testBank() {
        Account account = new Account(Currency.GBP, new BigDecimal(5000), AccountType.Debit);
        account.deposit(new BigDecimal(100));
        account.withdraw(new BigDecimal(200));

        Customer customer = new Customer("Ivan", "Petrov", LocalDate.of(1995, Month.JULY, 23));
        customer.addAccount(account);

        BigDecimal balance = customer.getBalance(Currency.GBP);
        System.out.println(balance);
    }
}
