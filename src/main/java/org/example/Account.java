package org.example;


public class Account {
    private String accountHolderName;
    private double balance;
    private final double minimumBalance = 500.00;

    public Account(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }
    public double deposit(double amount){
        this.balance += amount;
        return (this.balance);
    }
    public String withdraw(double amount){
        if (this.balance - amount < this.minimumBalance){
            return "Operation declined - cannot go below minimum balance";
        }
        else{
            this.balance -= amount;
            return "Your current balance is "+ this.balance;

        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", minimumBalance=" + minimumBalance +
                '}';
    }
}
