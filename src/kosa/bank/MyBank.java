package kosa.bank;

import java.util.Arrays;

public class MyBank {
	private Customer[] customers;
	private int customersNum; // 고객 수

	public MyBank() {
		customers = new Customer[10];
	}

	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
	}

	public Customer getCustomer(String id) {
		Customer cust = null;
		for (int i = 0; i < customersNum; i++) {
			if (customers[i].getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}
		return cust;
	}

	public Customer[] getAllCustomers() {
		// customers 배열을 바로 return하면 가득 채워지지 않으면 null 발생
		Customer newCustomers[] = new Customer[customersNum];
		// 배열 복사
//		for(int i = 0; i < customersNum; i++) {
//			newCustomers[i] = customers[i];
//		}
//		System.arraycopy(customers, 0, newCustomers, 0, customersNum);
		newCustomers = Arrays.copyOf(customers, customersNum);
		return newCustomers;
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
