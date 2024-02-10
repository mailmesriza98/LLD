package org.example;
import java.util.Date;
public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount>0){
            this.balance+=amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(int amount){
        if(amount>0 && this.balance>=amount){
            this.balance-=amount;
            System.out.println(amount + " was withdrawn successfully");
            return true;
        }else{
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            return false;
        }
    }

    public void addTransaction(String toAccount, double amount) {
        Date d=new Date();
        Transactions transaction = new Transactions(this.accountNumber, toAccount, amount, d);
        System.out.println("Transaction added: From " + this.accountNumber + " to " + toAccount + ", Amount: " + amount);
    }
}
