package com.htc.corejava.customer;

import java.util.ArrayList;

public class CustomerList {

    ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void printCustomers() {
        for (int i = 0; i < this.customers.size(); i++) {
            System.out.println(this.customers.get(i));
        }
    }

}
