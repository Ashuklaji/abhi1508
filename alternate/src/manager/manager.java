package manager;


	public class manager extends member{
	    private String department;

	    public manager(String name, int age, String phoneNumber,
	                    String address, double salary, String department) {
	        super(name, age, phoneNumber, address, salary);
	        this.department = department;
	    }
	    public void print() {
	    	super.info();
	    	System.out.println("Department" +department);
	    }
	}


