package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Account
{
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account()
    {
        this.name = "UnknownUser";
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public Account(String name, int id, double balance)
    {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest()
    {
        return this.balance * ((this.annualInterestRate / 100) / 12);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double money, String description)
    {
        if(balance >= money)
        {
            Transaction transaction = new Transaction('-', money, balance - money, description);
            transactions.add(transaction);

            balance -= money;
            System.out.println("Со счета списана указанная сумма.");
        }
        else
        {
            System.out.println("Нельзя снять со счета указанную сумму.");
        }
    }

    public void deposit(double money, String description)
    {
        Transaction transaction = new Transaction('+', money, balance + money, description);
        transactions.add(transaction);

        balance += money;
        System.out.println("Счет пополнен на указанную сумму.");
    }

    public void displayTransactions()
    {
        for (Transaction transaction : transactions)
        {
            System.out.println("Сумма транзакции: " + transaction.getAmount());
            System.out.println("Баланс: " + transaction.getBalance());
            System.out.println("Комментарий: " + transaction.getDescriprion());

            System.out.println();
        }
    }
}
