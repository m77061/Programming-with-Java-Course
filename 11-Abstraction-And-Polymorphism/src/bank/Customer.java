package bank;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
    private static long idCounter = 1;

    private final long id;
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private List<Account> accounts;

    public Customer(String firstName, String lastName, LocalDate birthDate) {
        this.id = idCounter;
        idCounter++;

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.accounts = new ArrayList<Account>();
    }

    public long getId() {
        return this.id;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public List<Account> getAccounts() {
        return Collections.unmodifiableList(this.accounts);
    }

    public BigDecimal getBalance(Currency currency) {
        BigDecimal balance = new BigDecimal(0);

        if (this.accounts.size() != 0) {
            for (Account account : this.accounts) {
                if (account.getCurrency() == currency) {
                    balance = balance.add(account.getBalance());
                }
            }
        }

        return balance;
    }

    @Override
    public String toString() {
        return this.getFullName();
    }
}
