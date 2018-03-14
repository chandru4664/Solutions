package oops.encapsulation;

public class Accountdetails<encrypt> {
private String name;
//protected int Accountnumber;
encrypt Accountnumber;
private String address;
private int contactnumber;
//public void setname(String name){
	//this.name=name;
//}
public String getname(){
	return name;
	}
/*public void setaddress(String address){
	this.address=address;
}*/
public String getaddress(){
	return address;
	}
/*public void setAccountnumber(int Accountnumber){
	this.Accountnumber=Accountnumber;
}*/
public int getAccountnumber(){
	return (int) Accountnumber;
	
	}
/*public void setname(int contactnumber){
	this.contactnumber=contactnumber;
}*/
public int getcontactnumber(){
	return contactnumber;
	
	}
public  Accountdetails(String n,int c,String add){
	n=name;
	//A=Accountnumber;
	c=contactnumber;
	add=address;
	
	}



}
