package by.htp.customertask.entity;

import java.util.Comparator;

public class Bank implements Comparator<Customer> {

	public int compare(Customer cust1, Customer cust2) {
		return cust1.getName().compareTo(cust2.getName());

	}

}
