package alternate1;
import java.util.Scanner;

public class alternate {
	

	
		public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int arr1[] =new int[n];
		int arr2[] = new int[n];
		for(int i =0;i<n;i++) {
			arr1[i] =sc.nextInt();
			
		}
		  alter(arr1,n,arr2);
		

	}
		  static void   alter(int arr1[],int n,int arr2[]) {
			  for(int i =0;i<n;i++) {
				 if(i%2 ==0) {
					 arr2[i] =arr1[i];
					 System.out.println(arr2[i]);
				 }
				  
			  }
			 
			
			
			
			
		}
			
			
		
}



