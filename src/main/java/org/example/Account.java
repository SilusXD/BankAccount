package org.example;

import java.util.Date;

public class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account()
    {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance)
    {
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

    public void withdraw(double money)
    {
        if(balance >= money)
        {
            balance -= money;
            System.out.println("Со счета списана указанная сумма.");
        }
        else
        {
            System.out.println("Нельзя снять со счета указанную сумму.");
        }
    }

    public void deposit(double money)
    {
        balance += money;
        System.out.println("Счет пополнен на указанную сумму.");
    }
}
