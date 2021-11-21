package com.gtrxone;

public class Account {
    private double balance;
    private String number;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account() {
        this("4521 5682 6556", 2500.00, "Default name", "Default email",
                "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("4565-5564-4452", 2500.00, customerName, customerEmail, customerPhoneNumber);
    }

    public void depositFunds(double amount) {
        balance += amount;
        System.out.println(amount + " deposited to yor account. New balance is " + balance);
    }

    public void withdrewFunds(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrew form your account. Remaining account balance is " + balance);
        } else {
            System.out.println("Your account balance is low, You can cannot withdrew " + amount + "");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


}
