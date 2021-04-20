package by.htp.customertask.logic;

import by.htp.customertask.entity.Customer;
import by.htp.customertask.presentation.CustomerPresentation;

public class CustomerLogic {
	
	CustomerPresentation view = new CustomerPresentation();
	

	public void CardNumber(Customer[] mass) {
		for (int i = 0; i < mass.length; i++) {
			if (mass[i].cardnumber > 500 && mass[i].cardnumber <= 10236024) {  // выводит список покупателей, у которых номер кредитной карточки находится интервале
				view.CardNumberList(mass,i);                                   // от 500 до 10236024
			}
		}

	}

}
