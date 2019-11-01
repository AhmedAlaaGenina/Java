package com.company;

public class Main {

    public static void main(String[] args) {
        bankAccount Ahmed = new bankAccount();

        Ahmed.setAccountNumber(1016);
        System.out.println("the Account Number is : " + Ahmed.getAccountNumber());

        Ahmed.setBalance(10000);
        System.out.println("His Balance is :" + Ahmed.getBalance());

        Ahmed.setEmail("ahmed.alaa4080@gmail.com");
        System.out.println("the Account Name is : " + Ahmed.getEmail());

        Ahmed.setPhoneNumber("01096796900");
        System.out.println("His Phone Number is :" + Ahmed.getPhoneNumber());

        Ahmed.setCustomerName("Ahmed");
        System.out.println("His Name is : " + Ahmed.getCustomerName());

        int afterDeposit = Ahmed.depositFunds(2000);
        System.out.println("After Deposit The Balance was : " + afterDeposit);

        int afterWithdrawal = Ahmed.withdrawal(1000);
        if (afterWithdrawal != -1) {
            System.out.println("After Withdrawal The Balance was : " + afterWithdrawal);
        } else {
            System.out.println("your Money isn't Enough");
        }

    }
}
