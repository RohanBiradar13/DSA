import java.util.ArrayList;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.Scanner;

public class GroceryShop {
	private String name;
	private double price;
	private int quantity;

	public GroceryShop(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "GroceryShop [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<GroceryShop> list = new ArrayList<GroceryShop>();

			boolean exit = false;
			int total = 0;
			int count = 0;
			while (!exit) {
				System.out.println("6.Add item to the list");
				System.out.println("1.Identify the item with the highest totalselling price");
				System.out.println("2.Calculate the total selling price of all items");
				System.out.println("3.Calculate the avergae selling price per item");
				System.out.println("4.Display all items");
				System.out.println("5.Remove the item by name");
				System.out.println("7.Update the price of the specified item");
				System.out.println("100.Exit");

				switch (sc.nextInt()) {
				case 6:
					System.out.println("Enter the details of the item : name, price and quantity");
					list.add(new GroceryShop(sc.next(), sc.nextDouble(), sc.nextInt()));
					System.out.println("Item added successfully...");
					break;
				case 1:
					/*
					 * String name = ""; GroceryShop highestSellingItem = list.get(0); double
					 * maxTotalSellingPrice = highestSellingItem.getPrice() *
					 * highestSellingItem.getQuantity(); for (GroceryShop g : list) { double
					 * totalSellingPrice = g.getPrice() * g.getQuantity(); if (totalSellingPrice >
					 * maxTotalSellingPrice) { maxTotalSellingPrice = totalSellingPrice;
					 * highestSellingItem = g; } }
					 * System.out.println("Highest selling price item is: " +
					 * highestSellingItem.getName());
					 */
					OptionalDouble total1 = list.stream().mapToDouble(g -> g.getPrice() * g.getQuantity()).max();
					System.out.println(total1);
					break;

				case 2:

					/*
					 * for (GroceryShop g : list) { total += g.getPrice() * g.getQuantity();
					 * count++; } System.out.println("Total price of all items is : " + total);
					 */

					double a = list.stream().mapToDouble(g -> g.getPrice() * g.getQuantity()).sum();
					System.out.println(a);

					break;
				case 3:
					/*
					 * double average = total / count;
					 * System.out.println("Average of all items is : " + average);
					 */
					OptionalDouble average = list.stream().mapToDouble(g -> g.getPrice()).average();
					System.out.println(average);
					break;
				case 4:
					list.forEach(System.out::println);
					break;
				case 5:
					String name = sc.next();
					Iterator<GroceryShop> iterator = list.iterator();
					while (iterator.hasNext()) {
						GroceryShop g = iterator.next();
						if (g.getName().equals(name))
							iterator.remove();
						System.out.println("Item removed succesfully " + g);
					}

					break;
				case 7:
					System.out.println("Enter the specified item name and price : ");
					name = sc.next();
					double price = sc.nextDouble();
					for (GroceryShop g : list) {
						if (g.getName().equals(name))
							g.setPrice(price);
						System.out.println("Item " + name + " " + "price " + price + " updated...");
					}
					break;
				case 100:
					exit = true;
					break;
				}
			}
		}
	}
}
