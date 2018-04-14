
public class BankAccountClient {

	
	public static void main(String[] args) {
		
		System.out.println();		
		System.out.println("with parameter");
		System.out.println();
				
		BankAccount B1=new BankAccount("Jake", 40.0);		
		System.out.println(B1.toString());		
		B1.deposit(500);		
		System.out.println(B1.toString());
		
		B1.withdraw(300);
		
		System.out.println(B1.toString());
		
		System.out.println();		
		System.out.println("without parameter");
		System.out.println();
		
		BankAccount B2=new BankAccount();
			
			System.out.println(B2.toString());
			
			B2.setName("Fattaneh");
			B2.setBalance(2000)	;
			
			System.out.println(B2.toString());	
			
			System.out.println(B1.toString());
		
	}

}
