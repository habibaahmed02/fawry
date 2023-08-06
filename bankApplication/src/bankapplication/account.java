package bankapplication;
public class account {
    private final int accountNumber;
    private final String accountHolderName;
    private double balance;

    public account(int accountNumber, String accountHolderName, double balance)throws Exception {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if(balance>=0)
        this.balance = balance;
        else throw new Exception("Enter a positive balance amount");
    }
    public double deposit(double depositAmount)throws Exception{
        if(depositAmount>0)
        balance+=depositAmount;
        else throw new Exception("Enter a positive deposit amount");
        return balance;
    }
    public double withdraw(double withdrawAmount) throws Exception{
        if(balance>=withdrawAmount)
        balance-=withdrawAmount;
        else throw new Exception("Insufficient balance amount");
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

  /*  public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }*/

    public String getAccountHolderName() {
        return accountHolderName;
    }

   /* public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }*/

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws Exception {
        if(balance>=0)
        this.balance = balance;
        else throw new Exception("A balance amount cannot be negative");
    }
}
