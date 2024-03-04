package array;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		//store and print age of 5 students
		
		//create array
		  int  age[] = new int[5];
		
		  //[20][][][][]
		  
		//write data in array
		  Scanner  sc = new Scanner(System.in);
		  
		 for(int i=0; i<age.length; i++) { 
			 
			 System.out.print("Enter your age  ");
		     age[i] = sc.nextInt();
		 }
		
		//read data from array
		
		 for(int x : age) {
			 
			 System.out.println(x);
		 }
		 
	}

}
