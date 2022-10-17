package vendingMachines001;

public class Cart extends VendingMachines{

	String payment;
	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	public Cart(String string) {
		this.payment=string;
		// TODO Auto-generated constructor stub
	}

	public double paymentMethod(String type,double money) {
		if(type.toLowerCase()=="card") {
			return money*2;	
		}
		else {
			return money;
		}
	}
	

}
