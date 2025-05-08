package by.hw.lessons.hw_16;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Создание пяти счетов
        Account account1 = new Account(01, "BYN001", "BYN", 1000.0);
        Account account2 = new Account(02, "BYN002", "BYN", 500.0);
        Account account3 = new Account(03, "BYN003", "BYN", 2000.0);
        Account account4 = new Account(04, "BYN004", "BYN", 800.0);
        Account account5 = new Account(05, "BYN005", "BYN", 1500.0);

        // Добавление счетов в банк
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

        // Вывод информации о счетах в банке
        System.out.println("Информация о счетах в банке:");
        for (Account account : bank.getAccounts()) {
            System.out.println("Номер счёта: " + account.getAccountNumber() + ", Валюта: " + account.getCurrency() + ", Сумма: " + account.getBalance());
        }

        try {
            // Вызов метода перевода денег
            bank.transferMoney("BYN001", "BYN002", 22.22);
            System.out.println("Перевод выполнен успешно.");
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }
    }
}