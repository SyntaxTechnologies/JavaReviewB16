package com.syntax.review7;

public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount bank=new BankAccount();
        bank.acccountHolder="John Smith";
        bank.accountNumber=4643635376L;
        bank.accBalance=20;
        bank.ssn=768696;

        //accessing static variables
        System.out.println(BankAccount.bankName);

        BankAccount bank1=new BankAccount();
        bank1.acccountHolder="Jane Smith";
        bank1.accountNumber=111111L;
        bank1.accBalance=2000;
        bank1.ssn=76869687;
        System.out.println(" ---------------  before ---------------   ");
        System.out.println(bank1.bankName); //NOT the right way to access Static variables - but it possible
        bank1.bankName="Chase";

        System.out.println(" ---------------  after  ---------------   ");
        System.out.println(BankAccount.bankName);


    }
}
