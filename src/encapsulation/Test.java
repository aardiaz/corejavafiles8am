package encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		 c.setId(3434);
		 c.setName("Radha");
		 c.setAge(30);
		 c.setCity("Ktm");
		 
		 System.out.println(c);
		 
		 
//		 System.out.println("Id = "+c.getId());
//		 System.out.println("Name = "+c.getName());
//		 System.out.println("Age = "+c.getAge());
//		 System.out.println("City = "+c.getCity());
	}

}
