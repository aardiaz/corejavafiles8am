package controlstms.looping;

public class EnhanceForTest {
	
	/*
	 *   ------------- Enhance For loop / forEach loop -------
	 *   # use to read data from collection(Array,List,set,map)
	 *   
	 *   syntax :
	 *   
	 *     for(data_type  var : collection ){
	 *           //statements
	 *     }
	 */
	
	public static void main(String[] args) {
		
		int[]   values  = {32,45,6,57,8,90,9,8,7,6,5,4,3,2,45,6,7,84,5,65};
		
		int s = 0;
		
		for(int x : values) {
			System.out.println(x);
			s =  s + x;
		}
		
		System.out.println("Total  = "+s);
		
	}

}
