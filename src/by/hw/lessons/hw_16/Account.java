package by.hw.lessons.hw_16;

import java.util.Objects;

public class Account {
    private  int id;
    private String accountNumber;
    private String currency;
    private double balance;

    public Account(int id, String accountNumber, String currency, double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && accountNumber == account.accountNumber;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, accountNumber);
    }
}