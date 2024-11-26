package io.fp.atm;

import org.checkerframework.checker.units.qual.radians;

public class Account {

    private AccountDetails details;
    private double overdraft;
    private double bankDeposit;
    
    public Account(AccountDetails details, double overdraft, double bankDeposit) {
        this.details = details;
        this.overdraft = overdraft;
        this.bankDeposit = bankDeposit;
    }

    public AccountDetails getDetails() {
        return details;
    }

    public void setDetails(AccountDetails details) {
        this.details = details;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    

    public double getBankDeposit() {
        return bankDeposit;
    }

    public void setBankDeposit(double bankDeposit) {
        this.bankDeposit = bankDeposit;
    }

    public void withdraw(double amount) throws IllegalWithdrawException{
        if((overdraft + bankDeposit) - amount < 0){
            throw new IllegalWithdrawException("Your transaction was declined.");
        }
        this.bankDeposit = (overdraft + bankDeposit) - amount;
        System.out.println("You have " + this.bankDeposit + " € on your account");

    }
}
