package methods;

public class MethodTest {
	
	public static void main(String[] args) {
		//sum();
		//printArea(80, 20);
		
		int a = getSumOf1to100();
		System.out.println("Total = "+a);
		
		
		int sv = findSmallest(8888, 34543);
		System.out.println("Smallest = "+sv);
		
	}
	
	//1. no return type with no argument
	static void sum() {
		
		int a = 500;
		int b = 800;
		
		int c = a + b;
		System.out.println("Sum  = "+c);
	}
	
	//2. no return type with arguments
	static void printArea(int l, int b) {
		
		int c = l * b;
		System.out.println("Area = "+c);
	}
	
	//3. return type with no arguments
	static int  getSumOf1to100() {
		
		int s = 0;
		
		for(int i=1; i<=100; i++) {
			//System.out.println(i);
			s = s  + i;
		}
		
		return s;
	}
	
	
	//4. return type with arguments
	static int  findSmallest(int x, int y) {
		
		   if(x < y) {
			   return x;
		   }
		   
		return y;
	}
	
	

}
