package org.example;

public class SimpleBankingSystem{
    public static void main(String[] args) {

        Account ac1=new Account("123456", 1000);
        Customer c1=new Customer("John", ac1);

        Account ac2=new Account("123458", 2000);
        Customer c2=new Customer("Tom", ac2);

        c1.transfer(c2,500);
        c2.transfer(c1,1000);
        System.out.println("Customer: " + c1.getName() + ", Balance: " + ac1.getBalance());
        System.out.println("Customer: " + c2.getName() + ", Balance: " + ac2.getBalance());

    }
}