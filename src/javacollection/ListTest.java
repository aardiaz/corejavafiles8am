package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		//List<String>  list = new ArrayList<>();
		List<String>  list = new LinkedList<>();
		
//		Student s1 = new Student();
//		------
//		------
//		------
//		list.add(s1);
		
		list.add("bhutan");
		list.add("china");
		list.add("korea");
		list.add("canada");
		
//		list.remove(3);
//		list.remove("bhutan");
//		System.out.println(list.contains("india"));
//		list.clear();
		
		for(String s : list) {
			System.out.println(s);
		}
	
		 /*
		  * a> List of Student
		  * b> List of Book
		  * c> List of Dog
		  */
		
	}
}
