package DesignQuestions.ATM;

public class UserBankAccount {

    int balance;


    public void withdrawalBalance(int amount) {
        balance = balance - amount;
    }
}
