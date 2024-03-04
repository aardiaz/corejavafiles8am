package objectwithmethod;

public class Test {
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
		
		Student x = t.getStudentData();
		t.printStudent(x);
	}
	
	//1. object as parameter
	void printStudent(Student s) {
		
		System.out.println("Id = "+s.getId());
		System.out.println("FirstName = "+s.getFname());
		System.out.println("LastName = "+s.getLname());
		System.out.println("College = "+s.getCollege());
		System.out.println("Rollno = "+s.getRollno());
	}
	
	
	//2. object as return type 
	  Student getStudentData() {
		  
		  Student std = new Student();
			
			std.setId(3434);
			std.setFname("Ashok");
			std.setLname("Sharma");
			std.setCollege("NCC");
			std.setRollno(5003);
		  
		  return std;
	  }
	  
	  //3. array of object as parameter
	  
	  //4. array of object as return type
}








