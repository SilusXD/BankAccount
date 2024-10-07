package org.example;

import java.util.Date;

public class Transaction
{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String descriprion;

    public Transaction(char type, double amount, double balance, String descriprion)
    {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.descriprion = descriprion;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }
}
