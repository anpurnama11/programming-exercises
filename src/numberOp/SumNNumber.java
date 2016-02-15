package numberOp;

import java.util.Scanner;

/*
 * solution for sum n number problem
 */

public class SumNNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		input.close();
	}
	
}
