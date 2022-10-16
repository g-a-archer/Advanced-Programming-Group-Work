package test;

import org.hibernate.Session;

import factories.HBFactory;
import model.Department;

public class DepartmentTest {

	public static void main(String[] args) {
		new HBFactory();
		Session sesh = HBFactory.getSession();

		sesh.beginTransaction();

		Department dep = new Department("200", "Management");

		sesh.save(dep);
		sesh.getTransaction().commit();

		System.out.println("Dep ID: " + dep.getName());

	}

}
