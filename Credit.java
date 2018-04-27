import java.util.ArrayList;

public class Credit extends CostSources implements Comparable<Credit> {

	private static int countCredit=0;
	public static final int ExcellentCredit=740;
	public static final int GoodCredit=600;
	public static final int BadCredit=500;

	private String creditName;
	private int id;
	private String dueDate;
	private double availableToSpend;
	private double minimumPayment;	
	private double creditLimit;
	private double currentBalance;
	private double amount;

	ArrayList<Credit> CreditList =new ArrayList<Credit>();
	
	public Credit(double initAmount , String initCreditName,String initDueDate ,
			double initAvailableToSpend,double initMinimumPayment,
			double initCreditLimit,double initCurrentBalance)
	{
		super(initAmount);
		countCredit++;
		this.id=countCredit;		
		this.amount=initAmount;
		this.creditName=initCreditName;
		this.setDueDate(initDueDate);
		this.availableToSpend=initAvailableToSpend;
		this.minimumPayment=initMinimumPayment;
		this.creditLimit=initCreditLimit;
		this.currentBalance=initCurrentBalance;
	}	
	public int getcountCredit() {
		return countCredit;
	}
	public void makePayment(double payAmount){
		this.setAmount(this.getAmount() + payAmount);
	}
	public double getminimumPayment() {
		return minimumPayment;
	}
	public void setminimumPayment(double minimumPayment) {
		this.minimumPayment=minimumPayment;
	}
	public void setCreditName(String creditName) {
		this.creditName=creditName;
	}

	public String getCreditName() {
		return creditName;
	}
	// Returns whether o refers to a Credit object with the same due date 
	public int CompareTo(Credit other) {
		return dueDate.compareTo(other.dueDate);
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

	public void useCredit(double withdraw) {
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
		return  creditName.toString() + " " + Double.toString(currentBalance) + " " +  Double.toString(creditLimit)  + " " +  Double.toString(availableToSpend) ;
	}

	//if credit limit is equal check the current balance
	public int compareTo(Credit other) {

		if(creditLimit== other.creditLimit) {
			if(currentBalance<other.currentBalance) {
				return -1;
			}
			else if(currentBalance> other.currentBalance )
			{
				return 1;
			}
			else {
				return 0;
			}
		}else {
			return creditName.compareTo(other.creditName);
		}

	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
}
