
public class BankAccount {

	private String name;
	private double balance;
		
	public BankAccount(String initialName,double initialBalance){
		balance=initialBalance;
		name=initialName;
	}	
	public void setName(String newName){
		name=newName;
	}	
	public String getName(){
		return name;
	}	
	public double getBalance(){
		return balance;
	}
	public void setBalance(double newBalance){
		balance=newBalance;
	}
	public BankAccount(){
		balance=getBalance();
		name=getName();
	}
	public void deposit(double amount){		
		balance+=amount;		
	}	
	public void withdraw(double amount){
		balance-=amount;
	}	
	public String toString(){
		return name + "," + "$" + balance ;
	}	
	
}
