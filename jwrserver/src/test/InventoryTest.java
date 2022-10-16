package test;

import org.hibernate.Session;

import factories.HBFactory;
import model.Inventory;

public class InventoryTest {

	public static void main(String[] args) {
		Session sesh = new HBFactory().getSession();

		sesh.beginTransaction();

		Inventory inventory = new Inventory("Pepsi", 200, 50.0f, "Pepsi Drink", "A drink named pepsi");

		sesh.save(inventory);
		sesh.getTransaction().commit();
		sesh.close();
		System.out.println("Inventory Saved\n" + inventory);

	}

}
