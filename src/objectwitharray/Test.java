package objectwitharray;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		//store and print data of 5 products
		
		//create array of product
		Product  products[] =  new  Product[5];
		
		//write data in array
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<products.length; i++) {
			
			Product p = new Product();
			
			System.out.println("Enter id");
			p.setId(sc.nextInt());
			
			System.out.println("Enter name ");
			p.setName(sc.next());
			
			
			p.setPrice(80000);
			p.setCompany("CG");
			
			products[i] = p; 
		}
		 
		
		//read data from array
		
		int tp = 0;
		
		for(Product pd : products) {
			
			System.out.println(pd);
			
			if(pd.getCompany().equals("CG")) {
			  tp = tp + pd.getPrice();
			}
		}
		
		System.out.println("Total price = "+tp);
		
	}

}
