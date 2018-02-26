package oops.polymorphism;

public class Tmobile extends Provider {
public void payment(){
	System.out.println(" the monthly payment is $30");
	
}
	public static void main(String[]args){
		Provider p=new Tmobile();
		p.payment();
	}
	

}
