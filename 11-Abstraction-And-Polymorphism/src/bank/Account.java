package bank;

import java.math.BigDecimal;

public class Account {
    private static final byte MIN_DEPOSIT_AMOUNT = 50;
    private static final byte MIN_WITHDRAW_AMOUNT = 10;

    private static long idCounter = 1;
    private final long id;
    private Currency currency;
    private BigDecimal balance;
    private AccountType accountType;

    public Account(Currency currency, BigDecimal initialBalance, AccountType accountType) {
        this.id = idCounter;
        idCounter++;

        this.currency = currency;
        this.deposit(initialBalance);
        this.accountType = accountType;
    }

    public long getId() {
        return this.id;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public BigDecimal getBalance() { return this.balance; }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public void deposit(BigDecimal amount) {
        boolean isAmountValid = amount.compareTo(new BigDecimal(MIN_DEPOSIT_AMOUNT)) >= 0;

        if (!isAmountValid) {
            String exceptionMessage = String.format("Given amount is less than %d", MIN_DEPOSIT_AMOUNT);
            throw new IllegalArgumentException(exceptionMessage);
        }

        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        boolean isAmountValid = amount.compareTo(new BigDecimal(MIN_WITHDRAW_AMOUNT)) >= 0;

        if (!isAmountValid) {
            String exceptionMessage = String.format("Given amount is less than %d", MIN_WITHDRAW_AMOUNT);
            throw new IllegalArgumentException(exceptionMessage);
        }

        boolean hasEnough = this.balance.compareTo(amount) >= 0;

        if (!hasEnough) {
            throw new IllegalArgumentException("Insufficient funds!");
        }

        this.balance = this.balance.subtract(amount);
    }
}
