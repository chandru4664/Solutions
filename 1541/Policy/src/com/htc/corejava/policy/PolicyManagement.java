package com.htc.corejava.policy;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PolicyManagement {
    HashMap<Integer, PolicyInfo> policies = new HashMap<Integer, PolicyInfo>();

    public boolean issuePolicy(PolicyInfo policy) {
        if (!(this.policies.containsKey(policy.getPolicyNumber()))) {
            this.policies.put(policy.getPolicyNumber(), policy);
            System.out.println("Policy issued");
            return true;
        } else {
            System.out.println("Policy already exists");
            return false;
        }
    }

    public boolean renewPolicy(Integer policyNumber) {
        Calendar calendar = Calendar.getInstance();
        Date issueDate = calendar.getTime();
        calendar.add(Calendar.YEAR, 1); // to get previous year add -1
        Date expireDate = calendar.getTime();
        if (this.policies.containsKey(policyNumber)) {
            this.policies.get(policyNumber).setIssueDate(issueDate);
            this.policies.get(policyNumber).setExpireDate(expireDate);
            return true;
        } else {
            System.out.println("The policy number isn't valid");
            return false;
        }
    }

    public boolean cancelPolicy(Integer policyNumber) {
        if (this.policies.containsKey(policyNumber)) {
            this.policies.remove(policyNumber);
            return true;
        } else {
            System.out.println("The policy number isn't valid");
            return false;
        }
    }

    public void printPolicies() {
    	//old way
        Iterator iterator = this.policies.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry policyNumber = (Map.Entry) iterator.next();
            System.out.println(policyNumber);
        }
    }
    
    public void printPoliciesNew() {
    	//new way
    	for(Map.Entry<Integer, PolicyInfo> entry : policies.entrySet()) {
    		System.out.println("Policy Nnumber " + entry.getKey() + " , Policy Information " + entry.getValue());
    	}
    }
}
