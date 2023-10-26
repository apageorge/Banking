package org.example;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountHolderName, double balance, double interestRate) {
        super(accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountHolderName=" + getAccountHolderName() +'\'' +
                "balance=" + getBalance() +'\'' +
                "minimumBalance=" + getMinimumBalance() +'\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
