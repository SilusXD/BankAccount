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
    }
}
