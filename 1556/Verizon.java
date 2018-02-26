package oops.polymorphism;

public class Verizon extends Provider {
public void payment(){
	System.out.println("The monthly payment is $20");
	
}
public static void main(String[]args){
	Provider p2=new Verizon();
	p2.payment();
}
	
}
