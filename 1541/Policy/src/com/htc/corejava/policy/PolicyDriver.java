package com.htc.corejava.policy;

import java.util.Calendar;

public class PolicyDriver {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        //calendar.add(Calendar.YEAR, 1); // to get previous year add -1
        PolicyManagement policyManagement = new PolicyManagement();
        policyManagement.issuePolicy(getPolicyInfo(calendar));
        policyManagement.issuePolicy(getPolicyInfo1(calendar));
        policyManagement.issuePolicy(getPolicyInfo2(calendar));

        System.out.println("Initial policies");
        policyManagement.printPoliciesNew();

        policyManagement.renewPolicy(3);
        System.out.println("After renewal");
        policyManagement.printPolicies();

        policyManagement.cancelPolicy(2);
        System.out.println("After cancellation");
        policyManagement.printPolicies();

    }

	private static PolicyInfo getPolicyInfo2(Calendar calendar) {
		PolicyInfo policyInfo2 = new PolicyInfo();
        policyInfo2.setPolicyNumber(3);
        policyInfo2.setPolicyHolderName("Test");
        calendar.add(Calendar.YEAR, 1);
        policyInfo2.setIssueDate(calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        policyInfo2.setExpireDate(calendar.getTime());
        policyInfo2.setPremium(8880.436);
		return policyInfo2;
	}

	private static PolicyInfo getPolicyInfo1(Calendar calendar) {
		PolicyInfo policyInfo1 = new PolicyInfo();
        policyInfo1.setPolicyNumber(2);
        policyInfo1.setPolicyHolderName("Rakesh");
        calendar.add(Calendar.YEAR, 1);
        policyInfo1.setIssueDate(calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        policyInfo1.setExpireDate(calendar.getTime());
        policyInfo1.setPremium(600.436);
		return policyInfo1;
	}

	private static PolicyInfo getPolicyInfo(Calendar calendar) {
		PolicyInfo policyInfo = new PolicyInfo();
        policyInfo.setPolicyNumber(1);
        policyInfo.setPolicyHolderName("Naren");
        policyInfo.setIssueDate(calendar.getTime());
        calendar.add(Calendar.YEAR, 1);
        policyInfo.setExpireDate(calendar.getTime());
        policyInfo.setPremium(500.436);
		return policyInfo;
	}
}
