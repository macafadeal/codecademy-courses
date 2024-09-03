public class Dog {
	String breed;
	boolean hasOwner;
	int age;

	public Dog(String dogBreed, boolean dogOwned, int dogAge) {
		System.out.println("Constructor invoked!");

		breed = dogBreed;
		hasOwner = dogOwned;
		age = dogAge;
	}

	public static void main(String[] args) {
		System.out.println("The Main method has started...");
		Dog kate = new Dog("mixed", true, 15);
		Dog toddy = new Dog("english cocker spaniel", true, 5);

		boolean isKateOlder = kate.age > toddy.age;
		int totaldogAge = kate.age + toddy.age;

		System.out.println("Two dogs created: a " + kate.breed + " and a " + toddy.breed);
		System.out.println("The statement that fido is an older dog is: " + isKateOlder);
		System.out.println("The total age of the dogs is: " + totaldogAge);
		System.out.println("Main method finished");
	}
}