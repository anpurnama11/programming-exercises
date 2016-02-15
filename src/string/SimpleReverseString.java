package string;

import java.util.Scanner;

/*
 * solution for reverse string problem
 */

public class SimpleReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String sentence=input.nextLine();
		char[] characters=sentence.toCharArray();
		char[] reverse = new char[characters.length];
		for(int i=characters.length-1,j=0;i>=0;i--,j++)
		{
			reverse[j]=characters[i];
		}
		for(int i=0;i<reverse.length;i++)
		{
			System.out.print(reverse[i]);
		}
		input.close();
	}
}
