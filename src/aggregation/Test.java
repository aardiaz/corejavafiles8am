package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car  c = new Car();
		
		c.setColor("Blue");
		c.setPrice(8000000);
		c.setModel("MT800");
		
		Employee  emp = new Employee();
		
		emp.setId(34344);
		emp.setName("Hari");
		emp.setSalary(400000);
		emp.setCompany("Google");
		emp.setCar(c);
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Salary = "+emp.getSalary());
		System.out.println("------- car info -----");
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Price = "+emp.getCar().getPrice());
		System.out.println("MOdel = "+emp.getCar().getModel());
	}

}
