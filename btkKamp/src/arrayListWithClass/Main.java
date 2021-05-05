package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		//Customer kubra = new Customer(1,"Kubra","Sonmez");
		customers.add(new Customer(1,"Kubra","Sonmez"));
		customers.add(new Customer(2,"Esra","Sonmez"));
		customers.add(new Customer(3,"Busra","Sonmez"));
		
		
		//customers.remove(kubra);
		//customers.remove(new Customer(1,"Kubra","Sonmez")); //yeni referans oluþtrduk
		
		for (Customer customer : customers) {
			System.out.println(customer.firstName + " " + customer.lastName);
		}

	}

}
