package bankapplication;

import java.util.ArrayList;

public class bank {
    ArrayList<account> accounts = new ArrayList<>();
    account account1;

    public bank() throws Exception {
        this.account1 = new savingsAccount(1,"Mohamed",500,0.7);
         accounts.add(account1);
    }

    public void addAccount(String accountHolderName, double balance, double interest) throws Exception{
        account acc=new savingsAccount(accounts.size(),accountHolderName,balance,interest);
        if(balance<=0)
            throw new Exception("enter a positive balance value");
        accounts.add(acc);
    }
    public double deposit(int accountNumber,double depositAmount)throws Exception{
        if(depositAmount>0)
            accounts.get(accountNumber-1).deposit(depositAmount);
        else throw new Exception("Enter a positive deposit amount");
        return accounts.get(accountNumber-1).getBalance();
    }
    public double withdraw(int accountNumber,double withdrawAmount) throws Exception{
        if(accounts.get(accountNumber-1).getBalance()>=withdrawAmount)
            accounts.get(accountNumber-1).setBalance(accounts.get(accountNumber-1).getBalance()-withdrawAmount);
        else throw new Exception("Insufficient balance amount");
        return accounts.get(accountNumber-1).getBalance();
    }

    
}
