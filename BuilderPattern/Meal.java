import java.util.List;
import java.util.ArrayList;

public class Meal {

	// This is generic meal array where we will store our meals
	
	private List<Item> items = new ArrayList<>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for (Item i : items) cost += i.price();
		return cost;
	}
	
	public void showItems() {
		for (Item i : items)
			System.out.printf("Item: %s, Packing: %s, Price %.2f%n", i.name(), i.packing().pack(), i.price());
	}
}