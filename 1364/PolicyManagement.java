package com.htc.javabasics;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Date;

public class PolicyManagement {
	
	HashMap<Integer, PolicyInfo> policies = new HashMap<Integer, PolicyInfo>();
	
	public void issuPolicy(PolicyInfo policy) {
		Integer polnum = policy.getPolicyNumber();
		policies.put(polnum,policy);
	}
	
	public boolean renewPolicy(Integer policyNumber) {
		
		Integer searchPolicy = policyNumber;
		if (policies.containsKey(searchPolicy) == true) {
			Calendar c = Calendar.getInstance();
			c.setTime(new Date());
			c.add(Calendar.YEAR, 1);
			Date newDate = c.getTime();
			 System.out.println("==============================================================================================");
			 System.out.println("Search for policy :" + searchPolicy);	
			 System.out.println("Policy " +searchPolicy+ " is found");
	   		 System.out.println("Update issue date to current date");
	   		 System.out.println("Update expiry date to plus one year of issue date");
	   		 policies.get(searchPolicy).setIssueDate(new Date());
	     	 policies.get(searchPolicy).setExpireDate(newDate);
 	
		}
		
		return true;
	}
	
	public boolean cancelPolicy(Integer policyNumber) {
		
		Integer cnclPolicy = policyNumber;
				
		System.out.println("Policy number " + cnclPolicy + " needs to be cancelled..");
		Set<Integer> keys = policies.keySet();
	    for(Integer key:keys){ 
	    	
  	     	 if(key.equals(202030)) {
  		   		 policies.remove(cnclPolicy);
	    		 System.out.println("Policy number " + cnclPolicy + " found for cancellation..");
	    		 System.out.println("Policy number " + cnclPolicy + " is cancelled :( ");
	  	 }

	    }
	    return true;
		}
	     
	public void printPol() {
		Set<Integer> keys = policies.keySet();
    	for (Integer key:keys) {
			System.out.println(key + "...." + policies.get(key));
		}
	}
	
	
	public static void main(String[] args) {
		boolean pol;
		boolean cpol;
		Integer srchPol = 0;
		Integer canclPol = 0;
		PolicyManagement pm = new PolicyManagement();
		
		//policies are created
		PolicyInfo p1  = new PolicyInfo(101010,"Ajay",new Date(),new Date(),1000.0);
		PolicyInfo p2  = new PolicyInfo(202020,"Mary",new Date(),new Date(),2000.0);
		PolicyInfo p3  = new PolicyInfo(202030,"Sanjay",new Date(),new Date(),4500.0);
		PolicyInfo p4  = new PolicyInfo(202040,"Giri",new Date(),new Date(),3300.0);
		PolicyInfo p5  = new PolicyInfo(202050,"Adam",new Date(),new Date(),4600.0);
		
		pm.issuPolicy(p1);
		pm.issuPolicy(p2);
		pm.issuPolicy(p3);
		pm.issuPolicy(p4);
		pm.issuPolicy(p5);
		
		pm.printPol();
		
		//search for a given policy if found change issueDate and expireDate else send msg.
		srchPol = 101010;
		 
		if (pm.renewPolicy(srchPol)) {
			System.out.println("===========================policy is renewed successfully=================================== ");
		}
		canclPol = 202030;
		cpol = pm.cancelPolicy(canclPol);
		
	  	System.out.println("<----------------------------Display updated list of policies--------------------------->");
		pm.printPol();
	}
	
			
	    
		
}

	

