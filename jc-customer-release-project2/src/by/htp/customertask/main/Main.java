package by.htp.customertask.main;

import java.util.Set;
import java.util.TreeSet;

import by.htp.customertask.entity.Bank;
import by.htp.customertask.entity.Customer;
import by.htp.customertask.logic.CustomerLogic;
import by.htp.customertask.presentation.CustomerPresentation;

public class Main {

	public static void main(String[] args) {

		Customer custom1 = new Customer(1, "Lili", "Evans", "Molly", "London Picadilly 25", 10236023, 963452);
		Customer custom2 = new Customer(1, "Harry", "Potter", "James", "Baranovichi Sovetskiy 45,63", 10236024, 110203);
		Customer custom3 = new Customer(1, "Bill", "Weasley", "Arthur", "Minsk Nezavisimosty 71", 10236063, 203569);
		Customer custom4 = new Customer(1, "Jorje", "Weasley", "Arthur", "London Picadilly 96", 10236021, 780321);
		Customer custom5 = new Customer(1, "Ella", "Fire", "Gven", "Baranovichi Nakonechnikova 32,81", 10236015,964123);

		Bank comp = new Bank();
		Set<Customer> people = new TreeSet<Customer>(comp);

		people.add(custom1);
		people.add(custom2);
		people.add(custom3);
		people.add(custom4);
		people.add(custom5);

		
		
		Customer [] cardmass = new Customer [] {custom1,custom2,custom3,custom4,custom5};
		CustomerLogic logic = new CustomerLogic();
		logic.CardNumber(cardmass);
		
		CustomerPresentation view = new CustomerPresentation();
		view.AlfabetName(people);
	}

}
