package com.htc.corejava.policy;

import java.util.Date;

public class PolicyInfo {
    int policyNumber;
    String policyHolderName;
    Date issueDate;
    Date expireDate;
    double premium;

    public int getPolicyNumber() {
        return this.policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return this.policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public Date getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpireDate() {
        return this.expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public double getPremium() {
        return this.premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "PolicyInfo [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName + ", issueDate=" + issueDate + ", expireDate=" + expireDate + ", premium=" + premium + "]";
    }
}
