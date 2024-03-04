package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Programmer  p = new Programmer();
		
		p.id = 3434;
		p.fname = "hari";
		p.lname = "Sharma";
		p.salary = 600000;
		p.bonus = 50000;
		p.progLang = "java";
		p.project = "CMS";
		
		p.print();
	}

}
