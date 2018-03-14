package com.htc.corejava.customer;

public class Customer {
    private int customerId;
    private String custName;
    private String address;
    private double creditLimit;
    private String contactNo;

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustName() {
        return this.custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getContactNo() {
        return this.contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + this.customerId + ", custName=" + this.custName + ", address=" + this.address + ", creditLimit=" + this.creditLimit + ", contactNo=" + this.contactNo + "]";
    }

}
