package array;

import java.util.Arrays;

public class ArrayWithMethod {
	
	/*
	 * --------------- Array With Method ------------------
	 *    a> array as argument:
	 *      
	 *      void sum(int a[]){
	 *      
	 *      }
	 *       
	 *       
	 *    b> array as return type :
	 *    
	 *       int[]  getValue(){
	 *        
	 *           //array = 90,3,34,455,45,45,5,456,5,565,6,656,,65,6
	 *        
	 *          return array;
	 *        }
	 */
	
	public static void main(String[] args) {
//		int values[] =  {4,56,7,89,8,76,54,3,56,7,6,8,9,7,65};
//		sum(values);
		
		int[]   x = get5IntValues();
		System.out.println(Arrays.toString(x));
		
		
	}
	
	
	//---- array  as arguments -------------------
	
	static void sum(int data[]) {
		
		   int s = 0;
		   for(int x : data) {
			   s = s + x;
		   }
		   
		   System.out.println("Total  = "+s);
	}
	
	
	//------- array as return type -----------------
	static  int[]  get5IntValues() {
		  
		    int[]  intvalues = {56,57,87,65,7};
		    return intvalues;
	  }
	
    
}








