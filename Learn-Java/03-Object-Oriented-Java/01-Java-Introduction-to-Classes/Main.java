public class Main {
	public static void main(String[] args) {
		Store lemonadeStand = new Store("lemonade", null, null);
		System.out.println(lemonadeStand.productType);

		Store cookieShop = new Store("cookies", 12, 3.75);
		System.out.println(cookieShop.productType + \n + cookieShop.inventoryCount + \n + cookieShop.inventoryPrice);
	}
}