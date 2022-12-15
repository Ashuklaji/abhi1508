package manager;

public class Main {
	 public static void main(String[] args) {
	        Employee employee = new Employee("Tom", 25, "555-555-55", "Home", 25631.5, "IT");
	        manager manager = new manager("Ron", 30, "555-617-55", "Earth", 69586.5, "IT");
	        employee.print();
	        manager.printSalary();
	        manager.print();
	        employee.print();
	    }

}
