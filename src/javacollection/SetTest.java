package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		
		//Set<String>  set = new HashSet<>();
		//Set<String>  set = new TreeSet<>();
		Set<String>  set = new LinkedHashSet<>();
		
		set.add("dell");
		set.add("samsung");
		set.add("acer");
		set.add("dell");
		set.add("cg");
		set.add("canon");
		set.add("cg");
		set.add("gs");
		
		for(String s : set) {
			System.out.println(s);
		}
		
		/*
		 * a> Set of Teacher and Cow
		 */
	}

}
