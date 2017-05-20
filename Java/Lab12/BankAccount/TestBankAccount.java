/**
 * A Test Class for the BankAccount class
 * @author Silviya Tacheva
 * @version 1.0 16/02/2017
 */
public class TestBankAccount 
{
  public static void main(String[] args) 
  {
    // Create an instance of the BankAccout class
    // with name Silviya Tacheva
    // and interest rate of 5.3
    // and overdraft limit of 100
    
    BankAccount myAccount = new BankAccount("Silviya Tacheva", 5.3, 50);
    
    //Test the getter methods
    System.out.println("Name: " + myAccount.getName());
    System.out.println("Balance: " + myAccount.getBalance());
    System.out.println("Interest rate: " + myAccount.getInterest());
    System.out.println("Overdraft limit: " + myAccount.getOverdraftLimit());
    
    //Test the setter methods
    myAccount.setName("Miss Silviya M Tacheva");
    myAccount.setBalance(500.29);
    myAccount.setInterest(1.75);
    myAccount.setOverdraftLimit(50);
    
    //Test the depositMoney() method 
    myAccount.depositMoney(10.21);
    System.out.printf("\nUpdated balance: %.2f\n", myAccount.getBalance());
    
    //Test the withdrawMoney() method when funds are sufficient
    myAccount.withdrawMoney(311);
    System.out.printf("\nUpdated balance: %.2f\n", myAccount.getBalance());
    
    //Test the withdrawMoney() method when funds are insufficient
    //Should display an alert
    myAccount.withdrawMoney(200);
    
    //Test withdrawWithinOverdraft() method when withdrawal is within the limit
    myAccount.withdrawWithinOverdraft(200);
    System.out.printf("\nUpdated balance: %.2f\n", myAccount.getBalance());
    
    //Test the depositMoney() method when customer is overdrawn
    myAccount.depositMoney(0.70);
    System.out.printf("\nUpdated balance: %.2f\n", myAccount.getBalance());
    
    //Test withdrawWithinOverdraft() method when withdrawal exceeds the limit
    //Should diplay an alert
    myAccount.withdrawWithinOverdraft(50);
    
    //Test toString() method
    System.out.println("\n" + myAccount.toString());
  }
}