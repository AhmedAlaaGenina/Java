package com.company;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(String name, int creditLimit) {
        this(name,creditLimit,"ahmed@email.com");
        this.name = name;
        this.creditLimit = creditLimit;
        System.out.println("cons with 2 and 1 defult");
    }

    public VipCustomer() {
        this("Ahmed",10000,"ahmed@gmail.com");
        System.out.println("this empty cons");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("cons with 3 par");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
