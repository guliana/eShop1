package sk.ima.eShop;

import java.util.*;

public class ProductPackage {
	Scanner sc = new Scanner(System.in);

	public void setChoice() {
		String choice = new String();
		List<Product> products = new ArrayList<Product>();
		List<Product> orders = new ArrayList<Product>();
		List<Order> allOrders = new ArrayList<Order>();
		while (choice != "6") {
			System.out.println(
					"Welcome!\nFor action press number:\n1) Add product\n2) Remove product\n3) Show all products\n4) Make an order\n5) Show all orders\n6) Quit application");
			choice = sc.nextLine();
			switch (choice) {
			case "1":
				System.out.println("Add product id");
				int id = sc.nextInt();
				System.out.println("Add product name");
				String productName = sc.next();
				System.out.println("Add product prize");
				sc.useLocale(Locale.US);
				double prize = sc.nextDouble();
				System.out.println("Your product was added to Product list");
				Product one = new Product(id, productName, prize);
				System.out.println(one.toString());
				products.add(one);
				break;
			case "2":
				System.out.println("Select product to remove by its id");
				String select = sc.nextLine();
				int id1 = Integer.parseInt(select);
				for (Product product : products) {
					if (id1 == product.getId())
						products.remove(product);
				}
				break;
			case "3":
				System.out.println(products.toString());
				break;
			case "4":
				System.out.println("Select a product by its id");
				String selectOrder = sc.nextLine();
				int id2 = Integer.parseInt(selectOrder);
				for (Product product : products) {
					if (id2 == product.getId()) {
						
						//orders.add(product);
						Order two= new Order(product);
						allOrders.add(two);
						//allOrders.add(product);
						System.out.println("Your order: "+ allOrders);
						}
				}
				
				
				break;
			case "5":
				System.out.println("All orders:");
				System.out.println(allOrders.toString());
				//System.out.println(orders.toString());
				break;
			case "6":
				System.out.println("Goodbye");
				break;
			}
		}
	}

}
