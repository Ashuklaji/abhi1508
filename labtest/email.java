package labtest;
import java.util.Scanner;

public class email {
	public static void main(String args[]) {
		System.out.println("Enter the email");
		Scanner sc = new Scanner(System.in);
		String email1 = sc.nextLine();
		String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
	        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	
			
				try {
					if(!email1.matches(regexPattern)) 
						throw new Myexception("Email is not Valid");
					System.out.println("Email is Valid");
				}catch(Myexception e) {
					System.out.println(e.getMessage());
				}
 }
}
