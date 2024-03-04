package constructor;

public class User {
	
	//instance variable
	String username;
	String password;
	
	//---------- default constructor -------
	User(){
		username = "root";
		password = "1234";
	}
	
	//----------- parameterized constructor ---------
	User(String username, String password){
		
		//this();//default constructor call
		//this(900);//parameterized constructor call
		
		this.username = username;
		this.password = password;//instance variable call
		
		//this.printUser();//instance methods call
		
		/*
		 * # 'this' keyword represents current object.
		 * #  using 'this' keyword we can call :
		 *    -> instance variables
		 *    -> instance methods
		 *    -> constructors
		 */
	}
	
User(String username){
		
		this.username = username;
	}
	
	void printUser() {
		System.out.println("UserName = "+username);
		System.out.println("Password = "+password);
	}

	public static void main(String[] args) {
		
		int a,n,m;
		a = 400;
		
		User u1,u2,u3;
		
		  u1 = new User();
		
		
//		User u = new User("Ashok","7777");
//		u.printUser();
		
		new User("Ashok","7777").printUser();
        
		/**
		 *  ---------------- Object Class/ Root Class ------------
		 *  implicitly inherited 
		 *  
		 * Class {@code Object} is the root of the class hierarchy.
		 * Every class has {@code Object} as a superclass. All objects,
		 * including arrays, implement the methods of this class.
		 */
		
	}
}
