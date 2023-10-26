package org.example;

public class CurrentAccount extends Account{
    private double maximumWithdrawalAmount;
    public CurrentAccount(String accountHolderName, double balance, double maximumWithdrawalAmount) {
        super(accountHolderName, balance);
        this.maximumWithdrawalAmount = maximumWithdrawalAmount;
    }

    public double getMaximumWithdrawalAmount() {
        return maximumWithdrawalAmount;
    }

    public void setMaximumWithdrawalAmount(double maximumWithdrawalAmount) {
        this.maximumWithdrawalAmount = maximumWithdrawalAmount;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountHolderName=" + getAccountHolderName() +'\'' +
                "balance=" + getBalance() +'\'' +
                "minimumBalance=" + getMinimumBalance() +'\'' +
                "maximumWithdrawalAmount=" + maximumWithdrawalAmount +
                '}';
    }

    @Override
    public String withdraw(double amount) {
        double tempBalance = this.getBalance();
        if (amount > this.maximumWithdrawalAmount){
            return "Operation declined - cannot withdraw more than " + this.maximumWithdrawalAmount;
        }
        else if (tempBalance - amount < this.getMinimumBalance()){
            return "Operation declined - cannot go below minimum balance";
        }
        else{
            this.setBalance(tempBalance -= amount);
            return "Your current balance is "+ this.getBalance();

        }
    }
}
