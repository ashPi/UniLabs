/**
 * A class which stores the properties and methods 
 * associated with a customer`s bank account
 * @author Silviya Tacheva
 * @version 1.0 16/02/2017
 */
public class BankAccount 
{
  
  /**
   * Customer`s name
   */
  private String name;
  
  /**
   * The balance of money in the account
   */
  private double balance;
  
  /**
   * Annual interest rate
   */
  private double interest;
  
  /**
   * Overdraft limit of the account
   */
  private double overdraftLimit;
  
  /*
   * Constructor for the BankAccount object
   * @param aName The customer`s name
   * @param interestRate The annual interest rate
   * @param anOverdraftLimit The overdraft limit
   */
  public BankAccount(String aName, double interestRate, double anOverdraftLimit) 
  {
    name = aName;
    balance = 0.00;
    interest = interestRate;
    overdraftLimit = anOverdraftLimit;
  }
  
  //------------Getter Methods-----------------
  
  /**
   * Gets the name of the customer
   * @return The name of the customer
   */
  public String getName() 
  {
    return name;
  }
  
  /**
   * Gets the balance of money in the account
   * @return The balance of money
   */
  public double getBalance() 
  {
    return balance;
  }
  
  /**
   * Gets the annual interest rate
   * @return The interest rate
   */
  public double getInterest() 
  {
    return interest;
  }
  
  /**
   * Gets the overdraft limit of the account
   * @return The overdraft limit
   */
  public double getOverdraftLimit() 
  {
    return overdraftLimit;
  }
  //------------Setter Methods-----------------
  
  /**
   * Sets the name of the customer
   * @param aName The name of the customer
   */
  public void setName(String aName) 
  {
    name = aName;
  }
  
  /**
   * Sets the balance of money in the account
   * @param aBalance The balance of money
   */
  public void setBalance(double aBalance) 
  {
    balance = aBalance;
  }
  
  /**
   * Sets the annual interest rate
   * @param interestRate the annual interest rate
   */
  public void setInterest(double interestRate) 
  {
    interest = interestRate;
  }
  
  /**
   * Sets the overdraft limit of the account
   * @param overdraftLimit The overdraft limit
   */
  public void setOverdraftLimit(double anOverdraftLimit) 
  {
    overdraftLimit = anOverdraftLimit;
  }
  //------------Other Methods------------------
  
  /**
   * Deposits money into the account
   * @param deposit Sum of money to be deposited into the account
   */
  public void depositMoney(double deposit) 
  {
    if(balance < 0) //20p charge when a customer is overdrawn
    {
      balance -= 0.20;
    }
    balance+= deposit;
  }
  
  /**
   * Checks the balance. If sufficient withdraws money, otherwise prints a warning
   * @param withdrawalSum The sum to be withdrawn
   */
  public void withdrawMoney(double withdrawalSum) 
  {
    if(balance < withdrawalSum) 
    {
      System.out.println("Insufficient funds in the account to cover this withdrawal!");
    }
    else 
    {
      balance-= withdrawalSum;
    }
  }
  
  /**
   * Withdrawal money within the overdraft limit
   * @param withdrawSum The sum to be withdrawn
   */
  public void withdrawWithinOverdraft(double withdrawalSum) 
  {
    if(balance - withdrawalSum < 0) 
    {
      if(Math.abs(balance - withdrawalSum) > overdraftLimit) 
      {
        System.out.println("The sum you would like to wthdraw exceeds the overdraft limit of the account!");
      }
      else 
      {
        balance-= (withdrawalSum + 0.20);
      }
    }
    else 
    {
      balance-= withdrawalSum;
    }
  }
  
  /**
   * A string representation of the contents of the fields of a BankAccount object
   * @return Information in the fields of a BanAccount
   */
  public String toString() 
  {
    String contents = "Customer`s name: " + getName();
    contents+= "\nBalance of money: " + getBalance();
    contents+= "\nAnnual interest rate of the account: " + getInterest();
    contents+= "\nOverdraft limit of the account: " + getOverdraftLimit();
    return contents;
  }
}