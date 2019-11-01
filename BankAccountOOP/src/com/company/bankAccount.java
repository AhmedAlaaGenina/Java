package com.company;

public class bankAccount {
    private int accountNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    private String customerName;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int depositFunds(int more) {
        return this.balance += more;
    }

    public int withdrawal(int less) {
        if (less <= this.balance) {
            return this.balance -= less;
        } else {
            return -1;
        }
    }

}
