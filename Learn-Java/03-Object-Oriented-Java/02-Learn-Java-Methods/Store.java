public class Store {
	String productType;

	public Store(String product) {
		productType = product;
	}

	public void advertise() {
		System.out.println("Come spend some money!");
		System.out.println("Selling " + productType + "!");
	}
}
