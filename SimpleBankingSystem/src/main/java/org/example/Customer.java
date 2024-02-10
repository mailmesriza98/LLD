package org.example;
import java.util.List;
public class Customer {
    private String name;

    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public void deposit(int amount){
        this.account.deposit(amount);
    }

    public boolean withdraw(int amount){
        return this.account.withdraw(amount);
    }

    public void transfer(Customer customer, int amount){
        if(this.account.withdraw(amount)){
            customer.deposit(amount);
            this.account.addTransaction(customer.getAccount().getAccountNumber(),amount);
            System.out.println("Transferred "+amount+" from "+this.account.getAccountNumber()+" to "+customer.getAccount().getAccountNumber()+" successfully");
        } else {
            System.out.println("Transfer failed due to insufficient funds.");
        }
    }

}
