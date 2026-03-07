import java.util.*;

class BankAccount
{
   private int accno;
   private String name;
   private double balance;

   ArrayList<String> Transactions=new ArrayList<>();

   
   public BankAccount(int accno,String name,double balance)
   {
     this.accno=accno;
     this.name=name;
     this.balance=balance;
        Transactions.add("Account Created with Balance "+balance);
   }
   public void deposit(double amount)
   {
      balance+=amount;
      Transactions.add("Deposit Amount "+amount);
      System.out.println("Deposit Amount "+amount);
   }
   public void withdraw(double amount)
   {
      if(balance>=amount)
      {
        balance-=amount;
        Transactions.add("Withdraw Amount "+amount);
        System.out.println("Withdraw Amount "+amount);
      }
      else 
      {
        Transactions.add("Withdraw Failed");
        System.out.println("Insufficient Amount U Cannot Withdraw the amount : "+amount);
      }
   }
   public void Check()
   {
      Transactions.add("Current Balance is "+balance);
      System.out.println("Current Balance is "+balance);
   }

   public void printTransactions()
   {
       System.out.println("---- Transactions History ----");
       for(String transaction:Transactions)
       {
         System.out.println(transaction);
       }
   }
}
public class Bank
{
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount(123,"bharath",500);
        acc1.deposit(10);
        acc1.Check();
        acc1.withdraw(20);
        acc1.Check();

        acc1.printTransactions();
        
    }
}