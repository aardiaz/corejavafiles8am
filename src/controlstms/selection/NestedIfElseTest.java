package controlstms.selection;

public class NestedIfElseTest {
	
	/*
	 *   ----------- Nested if-else ----------------
	 *     syntax :
	 *     
	 *        if(condition-1){
	 *         
	 *              if(condition-2){
	 *              
	 *                 if(condition-3){
	 *                    ................
	 *                    ......................
	 *                 }else{
	 *                 
	 *                 }
	 *              
	 *              }else{
	 *              
	 *              }
	 *        
	 *        }else{
	 *        
	 *        }
	 *            
	 */
	
	public static void main(String[] args) {
		
		String citizen = "india";
		int age = 100;

		
		 if(citizen.equals("nepali")) {
			 
			     if(age >= 18) {
			    	 System.out.println("You can vote !!");
			     }else {
			    	 System.out.println("You are under age !!");
			     }
			 
		 }else {
			 System.out.println("Invalid citizenship!!");
		 }
		 
		 
		 
		
	}

}







