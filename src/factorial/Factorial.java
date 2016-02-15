package factorial;

import java.util.Scanner;

/*
 * solution for evaluating factorial problem
 */

public class Factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int factorial=1;
		for(int i=n;i>1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
		input.close();
	}
	
}
