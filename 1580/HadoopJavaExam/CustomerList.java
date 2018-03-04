/**
 * @author narayana tangudu
 *
 */

package JHExam;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomerList {
	
		
	public static void main(String[] args) {
		
		ArrayList<String> customers  = null;
		
		File file = new File("../HadoopJava/src/JHExam/customers.txt");
		
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader(file));
			customers =  new ArrayList<String>();
			while(true){
				String line = br.readLine();
				if (line == null)
					break;
				customers.add(line);
			}
				
		}catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
		   e.printStackTrace();
		}
		finally {
			try{
				if(br!=null)
					br.close();
				} catch (IOException e){
					   e.printStackTrace();
				}
		}
		
		System.out.println(" ****** Customers from customers.txt-->ArrayList are ******");
		Iterator<String> itr = customers.iterator();
		while(itr.hasNext()){
			String customerName = itr.next();
			System.out.println(customerName);
		}
				
		
		}
		
			
	}
