package labtest;
import java.util.Scanner;

public  class returns {
	 static  void pos(String Str) {
		
		
		
	    int n = Str.length();
	    if(n>4) {
	    String st = Str.substring(0,n-4);
	    String st1 = Str.substring(n-4,n);
	    char ch[] = st.toCharArray();
	    for(int i =0;i<ch.length;i++) {
	    	ch[i] = '*';
	    	
	    }
	    String str = String.valueOf(ch);
	    String s3=str.concat(st1);
	    System.out.println(s3);
	    }
	    else {
	    	System.out.println("Invalid String");
	    }
		
	}
	public static void main(String args[]) {
		System.out.println("Enter the string");
		Scanner sc =new Scanner(System.in);
		String s  = sc.nextLine();
		
		 pos(s);
		 
	
	
	
	


    	
    

	
	
}
}
