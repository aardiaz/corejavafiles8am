package datatype;

import java.util.Scanner;

public class VariableTest {
	/*
	 * ----------- Variable ------------
	 * # use to store value in the program.
	 * # data stored for processing.
	 * 
	 *   syntax :
	 *   
	 *    data_type   variable_name;
	 */
	
	public static void main(String[] args) {
		
		//WAP to find area of Rectangle.
		
		  int l ;
		  int b ;
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter value of l ");
		  l = sc.nextInt();
		  
		  System.out.println("Enter value of b ");
		  b = sc.nextInt();
		  
		  
		  int area = l * b;
		  System.out.println("Area = "+area);
	}

}
