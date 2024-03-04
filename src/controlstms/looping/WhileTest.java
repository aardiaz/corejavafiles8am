package controlstms.looping;

public class WhileTest {
	
	/*
	 *   syntax :
	 *   
	 *     while(condition){
	 *     
	 *            //statements
	 *            
	 *            //inc/dec
	 *     }
	 */
	
	public static void main(String[] args) {
		
		//5! = 5x4x3x2 = 120
		
		int n = 5;
		int fact = 1;
		
		while(n>1) {
			
			fact = fact * n;
			
			n--;
		}
		
		System.out.println("Result = "+fact);
	}

}
