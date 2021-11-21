package com.gtrxone;

public class Main {

    public static void main(String[] args) {
//        Account account = new Account();//"2265 5666 4568", 50000.00, "Gunawardna R N W",
//                "gtrxone@gmail.com", "+94-704-888-610");
//
//        System.out.println(account.getBalance());
//        account.depositFunds(7100);
//        account.withdrewFunds(2500);
//        account.withdrewFunds(60000);
//        account.depositFunds(30000);
//        account.withdrewFunds(60000);
//
//        Account rajithasAccount = new Account("Rajitha","rajitha.25@live.com",
//                "0779851675");
//        System.out.println(rajithasAccount.getNumber());
//        System.out.println(rajithasAccount.getBalance());
//        rajithasAccount.withdrewFunds(2500);



        VipCustomer bobVIP = new VipCustomer("bob",500000);
        System.out.println(bobVIP.getName());
        System.out.println(bobVIP.getCreditLimit());

        VipCustomer maxVIP = new VipCustomer("max",300000.00,"maxdouod@mail.com");
        System.out.println(maxVIP.getName());
        System.out.println(maxVIP.getCreditLimit());
        System.out.println(maxVIP.getEmail());

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmail());
    }
}
