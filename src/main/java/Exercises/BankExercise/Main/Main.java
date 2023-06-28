package Exercises.BankExercise.Main;

import Exercises.BankExercise.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.accountHolder = "Jeff";
        account1.accountNumber = 1;
        account1.balance = 2.1;

        System.out.println(account1.accountNumber);
    }
}
