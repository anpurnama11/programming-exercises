package staircase;

import java.util.Scanner;

/*
 * solution for problem https://www.hackerrank.com/challenges/staircase
 */

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int testcase=input.nextInt(); //input amount of test cases
		for(int i=1;i<=testcase;i++)
		{
			for(int j=testcase;j>i;j--) //second loop for the space. it will print spaces as much as test cases-1
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) //third loop for the #. loop as much as test cases.
			{
				System.out.print("#");
			}
			System.out.println();
		}
		input.close();
	}

}
