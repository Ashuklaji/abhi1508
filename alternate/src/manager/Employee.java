package manager;

public class Employee extends member {
    private String specialization;

    public Employee(String name, int age, String phoneNumber,
                    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    public void print() {
    	super.info();
    	System.out.println("specilization" +specialization);
    }
}
