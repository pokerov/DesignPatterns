// Builder Design Pattern

// We use to create our classes and interface then one general (Meal).
// The "builder" in this case represents a menu but under the hood connects several objects.

public class BuilderPattern {

	public static void main(String[] args) {
		MealBuilder mb = new MealBuilder();
		
		Meal vegMeal = mb.prepareVegMeal();
		System.out.println("Vegetarian Meal\n=====");
		vegMeal.showItems();
		System.out.println("Total cost: " + vegMeal.getCost());
		
		Meal nonVegMeal = mb.prepareNonVegMeal();
		System.out.println("Non-Vegetarian Meal\n=====");
		nonVegMeal.showItems();
		
		System.out.println("Total cost: " + nonVegMeal.getCost());
	}
}