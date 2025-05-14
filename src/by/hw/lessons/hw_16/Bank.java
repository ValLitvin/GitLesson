package by.hw.lessons.hw_16;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private Set<Account> accounts;

    public Bank() {
        this.accounts = new HashSet<>();
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, double amount) throws AccountNotFoundException, NotEnoughMoneyException {
        Account fromAccount = findAccountByNumber(accountNumberFrom);
        Account toAccount = findAccountByNumber(accountNumberTo);

        if (fromAccount.getBalance() < amount) {
            throw new NotEnoughMoneyException("not.enough.money");
        }

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
    }

    private Account findAccountByNumber(String accountNumber) throws AccountNotFoundException {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new AccountNotFoundException("not.found.account");
    }
}