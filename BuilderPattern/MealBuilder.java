public class MealBuilder {
	
	// Actual builder class responsible to create Meal objects with Item interface
	
	// Available menus according our classes and interfaces
	
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger()); // Since VegBurger is child of Burger which implements Item interface
		meal.addItem(new Coke()); // Same reason as above
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}