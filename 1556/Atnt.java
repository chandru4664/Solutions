package oops.polymorphism;

public class Atnt extends Provider{
public void payment(){
	System.out.println("The monthly payment is $40");
	
	}
public static void main(String[]args){
	Provider p1=new Atnt();
	p1.payment();
}

}
