package com.pc7l.javaproj.inhrt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    File file = new File("MyFolder","customers.txt");
    //FileWriter fw = null;
    PrintWriter pw = null;
    
    try {
    	pw = new PrintWriter(new FileWriter(file));
		pw.println("1000,Ajay,5226 trot MI,5000,2459871212");
		pw.println("2000,pati,1226 detroit MI,7000,2254875212");
		pw.println("3000,sharma,1234 flint IL,6000,4254875413");
		pw.println("4000,reddy,14324 bloomfield CA,10000,3134875413");
		pw.println("5000,anand,9234 troy FL,8000,9254075413");
		pw.println("7000,sharma,60034 chicago IL,7500,8294870413");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    finally{
    		pw.close();
	
    }
    

	}

}
