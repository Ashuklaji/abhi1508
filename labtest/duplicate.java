package labtest;
import java.util.Scanner;


public class duplicate {
	public static void main (String args[]) {
		System.out.println("Enter the string");
		Scanner Sc =new Scanner(System.in);
		String string1 =Sc.nextLine();
		int flag;  
		          
		char string[] = string1.toCharArray();  
		          
		       
		       
		        for(int i = 0; i <string.length; i++) {  
		            flag= 1;  
		            for(int j = i+1; j <string.length; j++) {  
		                if(string[i] == string[j] && string[i] != ' ') {  
		                    flag++;  
		                    
		                    string[j] = '0';  
		                }  
		            }  
		           
		            if(flag > 1 && string[i] != '0')  
		                System.out.println(string[i]);  
	}
	}}
		
	
           


