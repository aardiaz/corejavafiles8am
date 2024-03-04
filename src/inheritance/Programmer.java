package inheritance;

public class Programmer extends Employee {

	  String progLang;
	  String project;
	  int bonus;
	  
	  void print() {
		  
		  super.print();
		  
		  System.out.println("Language = "+progLang);
		  System.out.println("Project = "+project);
		  System.out.println("Bonus = "+bonus);
	  }
}
