package addmatrix;
import java.util.Scanner;

public class matrixadd {
	
	
	    // To print a Matrix
	    static void printMatrix(int M[][],int m,int n)
	    {
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++)
	                System.out.print(M[i][j] + " "); 
	            System.out.println();
	        }
	    } 
	    //To add the two matrices and store in matrix c
	    static int[][] add(int a[][], int b[][], int m,int n)
	    {
	        int i, j;
	        int c[][] = new int[m][m]; 
	        for (i = 0; i < m; i++)
	            for (j = 0; j < n; j++)
	                c[i][j] = a[i][j] + b[i][j]; 
	        return c;
	    }
	    public static void main(String[] args) 
	    {
	        int p, q, m, n;    //Declare matrix size
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows in the first matrix:");
	        p = sc.nextInt();    //Initialize first matrix size
	        System.out.print("Enter the number of columns in the first matrix:");
	        q = sc.nextInt();   //Initialize the first matrix size
	        System.out.print("Enter the number of rows in second matrix:");
	        m = sc.nextInt();   //Initialize second matrix size
	        System.out.print("Enter the number of columns in the second matrix:");
	        n = sc.nextInt();   //Initialize the second matrix size
	        if (p == m && q == n) 
	        {
	            int a[][] = new int[p][q];    //Declare first matrix
	            int b[][] = new int[m][n];    //Declare second matrix            
	            //Initialize the first matrix
	            System.out.println("Enter all the elements of first matrix:");
	            for (int i = 0; i < p; i++) 
	            {
	                for (int j = 0; j < q; j++) 
	                {
	                    a[i][j] = sc.nextInt();
	                }
	            }
	            System.out.println("");            
	            //Initialize the second matrix
	            System.out.println("Enter all the elements of second matrix:");
	            for (int i = 0; i < m; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    b[i][j] = sc.nextInt();
	                }
	            }            
	            // Print the result
	            System.out.println("First Matrix:");
	            printMatrix(a, m, n);            
	            // Print the second matrix
	            System.out.println("Second Matrix:");
	            printMatrix(b, m, n);
	            int c[][] = add(a, b, m,n); 
	        // Print the result
	        System.out.println("Resultant Matrix:");
	        printMatrix(c, m, n);            
	        }
	        else
	        {
	            System.out.println("Addition not possible");
	            System.out.println("Try Again");
	        }
	    }
	}

