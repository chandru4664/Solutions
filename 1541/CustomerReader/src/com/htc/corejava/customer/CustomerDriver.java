package com.htc.corejava.customer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerDriver {

    public static void main(String[] args) throws IOException {
        FileInputStream inputFile = new FileInputStream("customers.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputFile));
        CustomerList customerList = new CustomerList();
        String line;
        try {
	        while ((line = bufferedReader.readLine()) != null) {
	            String[] customerData = line.split(",");
	            Customer customer = new Customer();
	            customer.setCustomerId(Integer.parseInt(customerData[0]));
	            customer.setCustName(customerData[1]);
	            customer.setAddress(customerData[2]);
	            customer.setCreditLimit(Double.parseDouble(customerData[3]));
	            customer.setContactNo(customerData[4]);
	            customerList.addCustomer(customer);
	        }
        }catch(IOException e) {
        	e.printStackTrace();
        }
        finally {
           inputFile.close();
     	   bufferedReader.close();
        }
        customerList.printCustomers();
       
    }
}
