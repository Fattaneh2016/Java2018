
public class UsingBankAccount extends CostSources{
	
	private String BankName;
		
	public UsingBankAccount(double initAmount) {
		super(initAmount);			
	}	
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}	
}
