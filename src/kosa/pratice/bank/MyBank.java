package kosa.pratice.bank;

import java.util.Arrays;

public class MyBank {
	private Customer[] customers;
	private int customersNum;
	
	public MyBank() {
		customers = new Customer[10];
	}

	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
	}
	
	public Customer getCustomer(String id) {
		Customer cust = null;
		for(int i = 0; i < customersNum; i++) {
			if(id.equals(customers[i].getId())) {
				cust = customers[i];
			}
		}
		return cust;
	}
	
	public Customer[] getAllCustomers() {
		Customer[] newCustomer = new Customer[customersNum];
//		for(int i = 0; i < customersNum; i++) {
//			newCustomer[i] = customers[i];
//		}
//		System.arraycopy(customers, 0, newCustomer, 0, customersNum);
		newCustomer = Arrays.copyOf(customers, customersNum);
		return newCustomer;
	}
	
	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public int getCustomersNum() {
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}
	
	
}
