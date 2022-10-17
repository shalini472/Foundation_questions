package vendingMachines001;

public class Products extends VendingMachines{

	String name;
	double price;
	public Products() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Products(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
