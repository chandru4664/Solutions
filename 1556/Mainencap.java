package oops.encapsulation;

public class Mainencap {
@SuppressWarnings("rawtypes")
public static void main(String[]args){
	
	Accountdetails a=new Accountdetails("Durga",387654321,"Ashoknagar");
	System.out.println(a.getname());
	System.out.println(a.getaddress());
	System.out.println(a.getcontactnumber());
	
}
}
