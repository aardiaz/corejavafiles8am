package methodoverriding;

public class PrabhuBank extends CentralBank {

	   @Override
	void getBankName() {
		 System.out.println("Prabhu bank");
	}
	   
	   @Override
	void getInterestRate() {
		 System.out.println("10%");
	}
}
