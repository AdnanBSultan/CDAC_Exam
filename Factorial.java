package tester;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long factorial = 1;
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; ++i)
        {
        	
            factorial = factorial * i;
            
        }
        System.out.println("Factorial of " + num + " is = " + factorial);
sc.close();
	}

}
