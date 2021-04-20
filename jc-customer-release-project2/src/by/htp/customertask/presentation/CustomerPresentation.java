package by.htp.customertask.presentation;

import java.util.Set;


import by.htp.customertask.entity.Customer;

public class CustomerPresentation {

	public void AlfabetName (Set<Customer> people) {
		for (Customer p : people) {

			System.out.println(p.getName());
		}
		
	}
	
	public void CardNumberList (Customer [] mass,int i) {
		System.out.println(mass[i]);
	}

}
