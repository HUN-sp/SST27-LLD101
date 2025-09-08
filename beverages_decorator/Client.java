package beverages_decorator;

	public class Client {

	public static void main(String[] args) {

		Beverage coffee = new Cappuccino();
		System.out.println("Plain Cappuccino: " + coffee.cost());
		
		
		
		Beverage chocolateCoffee = new Chocolate(new Cappuccino());
		System.out.println("Cappuccino with Chocolate: " + chocolateCoffee.cost());
		
		Beverage espressoSpecial = new Whip(new Cappuccino());
		System.out.println("Espresso with Milk and Whip: " + espressoSpecial.cost());


	}

}