package controlstms.looping;

public class ForTest2 {
	
	public static void main(String[] args) {
		
		  int s = 0;
		  
		  int start = 576;
		  int end = 688;
		  
		
		  for(; start<=end; start++) {
			  
			  //  10/2 = 5
			  // 11%2 = 1
			  
//			   if(i % 2 == 0) {
//				   
//			   }
			  
			  System.out.println(start);
			  s = s + start;
		  }
		  
		  System.out.println("Total = "+s);
	}
	
	//6569 -  89987

}
