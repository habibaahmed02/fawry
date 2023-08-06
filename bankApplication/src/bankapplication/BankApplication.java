package bankapplication;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please choose an operation\n1.show account balance\n2.deposit money\n3.withdraw money\n4.add an account");
        int choice;
        choice=scan.nextInt();
        bank bank=new bank();
        if(choice==1){
            System.out.println("enter account number");
            int accNum=scan.nextInt();
            checkAccount(accNum,bank);
            System.out.println("account balance= "+bank.accounts.get(accNum-1).getBalance());
        }
        else if(choice==2){
            System.out.println("enter the account number");
            int num=scan.nextInt();
            checkAccount(num,bank);
            System.out.println("enter the deposit amount");
            double amount=scan.nextDouble();
            bank.deposit(num, amount);
        }
        else if(choice==3){
            System.out.println("enter the account number");
            int num=scan.nextInt();
            checkAccount(num,bank);
            System.out.println("enter the withdraw amount");
            double amount=scan.nextDouble();
            bank.withdraw(num, amount);
        }
        else if(choice==4){
            System.out.println("enter your name");
            String name= scan.next();
            System.out.println("enter the amount of money you would like to deposit");
            Double amount=scan.nextDouble();
            bank.addAccount(name,amount,0.7);
        }              
         
    }
      public static void checkAccount(int accountNumber, bank bank)throws Exception{
        if((accountNumber-1)>bank.accounts.size())
            throw new Exception("Account not found");
        return;
    }
    
} 
