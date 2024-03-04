package oops;

import abstraction.UserService;
import abstraction.UserServiceImpl;
import methods.MethodTest2;

public class Test {
	
	public static void main(String[] args) {
		
		//Math Book
		Book  b = new Book();
		
		b.id = 3443;
		b.name = "Math";
		b.author = "SR Joshi";
		b.price = 5000;
		
		b.printBook();
		
		UserService us = new UserServiceImpl();
		us.addUser();
		
		
		
	}

}
