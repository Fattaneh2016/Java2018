
public class Credit extends CostSources implements  Comparable<Credit>{

	public static final int goodCredit=710;
	private static int id=10;
	private String cardId=null;
	private String creditName;
	private String dueDate;

	private double availableToSpend;
	private double minimumPayment;	
	private double creditLimit;
	private double currentBalance;



	public Credit(int cardId,String name,double creditLimit,double currentBalance,double withdraw,double amount) {
		super(amount);
		id=id++;
		currentBalance=0;
		creditName=name;
		creditLimit=2000;
		withdraw=0;

	}
	public void makePayment(double amount){
		super.deposit(amount);
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId() {
		this.cardId=cardId;
	}
	public int getId() {
		return id;
	}

	public void setCreditName(String creditName) {
		this.creditName=creditName;
	}

	public String getCreditName() {
		
		return creditName;
		
	}
	
	
	// Returns whether o refers to a Credit object with the same due date 
	public boolean equals(Object o) {
		if (o instanceof Credit) {
			// o is a Credit; cast and compare it
			Credit other = (Credit)o;
			return this.dueDate == other.dueDate ;
		} else {
			// o is not a credit; cannot be equal
			return false;
		}
	}

	public double getcurrentBalance() {

		return currentBalance;
	}
	public void setcurrentBalance(double balance) {

		this.currentBalance=balance;
	}
	public void setcreditLimit(double limit) {

		this.creditLimit=limit;
	}

	public double getcreditLimit() {

		return creditLimit;
	}

	public void setCredit(double withdraw) {
		currentBalance+=withdraw;
	}
	
	
	//total credit available
	public double totalCreditAvalable(double Available) {
		double totalAvailable=0;
		if(Available==0) {
			return 0;
		}else {
			return totalAvailable+totalCreditAvalable(Available-1);
		}
	}
	//sum of all credit balance
	public double totalCreditDebt( double debt) {
		double totalDebt=0;
		if(debt==0) {
			return 0;
		}else {
			return totalDebt+totalCreditDebt(debt-1);
		}
	}
	public double getCredit() {
		return currentBalance;
	}
	public String toStirng() {
		return creditName.toString() + " " + Double.toString(currentBalance) + " " +  Double.toString(creditLimit)  + " " +  Double.toString(availableToSpend) ;
	}

	//put credit name in order
	public int compareTo(Credit other) {

		if(cardId !=other.cardId) {
			return cardId.compareTo(other.cardId);
		}
		return creditName.compareTo(other.creditName);
	}



	/*
	 * 
	 * public boolean equals(Object o) {
		Point other = (Point) o;
		return x == other.x && y == other.y;
}

	 * Define equality of state.

	   @Override public boolean equals(Object aThat) {
	     if (this == aThat) return true;
	     if (!(aThat instanceof Account)) return false;

	     Account that = (Account)aThat;
	     return
	       ( this.fAccountNumber == that.fAccountNumber ) &&
	       ( this.fAccountType == that.fAccountType ) &&
	       ( this.fBalance == that.fBalance ) &&
	       ( this.fIsNewAccount == that.fIsNewAccount ) &&
	       ( this.fFirstName.equals(that.fFirstName) ) &&
	       ( this.fLastName.equals(that.fLastName) )
	     ;
	   }

	 */

}



