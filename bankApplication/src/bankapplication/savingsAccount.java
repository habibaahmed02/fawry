package bankapplication;
public class savingsAccount extends account {
        private double interestRate;

    public savingsAccount(int accountNumber, String accountHolderName,double balance,double interestRate)throws Exception {
        super(accountNumber,accountHolderName,balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) throws Exception {
        if(interestRate>0)
        this.interestRate = interestRate;
        else throw new Exception("An interest rate should be positive");
    }

    public double calculateInterest(){
        double balancePlusInterest= getBalance()*(1+interestRate);
        return balancePlusInterest;
    }
    
}
