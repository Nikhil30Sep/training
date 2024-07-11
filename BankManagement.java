package com.company;
import java.util.*;

interface bank{
    void deposit(long balance);
    void withdraw(long balance);
    void checkBalance(long balance);
}

class Alpha implements bank{
    Scanner sc = new Scanner(System.in);
    @Override
    public void deposit(long balance){
        System.out.println("Enter the amount you want to deposit : ");
        int money = sc.nextInt();
        if(balance>0){
            balance = balance+money;
            System.out.println("After Deposition , your current balance : " + balance);

        }else{
            System.out.println("After Deposition , your current balance : " + money);
        }
    }

    public void withdraw(long balance){
        System.out.println("Enter withdraw amount : ");
        int rupees  =sc.nextInt();
        if(balance>=rupees){
            balance = balance-rupees;
            System.out.println("After withdraw , your current balance : " + balance);
        } else{
            System.out.println("Limit exceed");
        }
    }
    public void checkBalance(long balance){
        System.out.println("Current balance : " + balance);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Alpha obj = new Alpha();
        long balance = 69000;

        System.out.println("Enter 1 for Deposit  \n Enter 2 for Withdraw \n Enter 3 for Balance ");
        int num = s.nextInt();
        switch (num) {
            case 1:
                obj.deposit(balance);
                break;
            case 2:
                obj.withdraw(balance);
                break;
            case 3:
                obj.checkBalance(balance);
                break;
            default:
                System.out.println("Wrong number pressed");
                break;
        }

    }
}
