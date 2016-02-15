package prime;

import java.util.Scanner;

/*
 * solution for prime checking problem
 */

public class SimplePrimeChecking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("masukkan angka yang ingin dicek:");
		Scanner input=new Scanner(System.in);
		int angka=input.nextInt();
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(angka%i==0) count++;
		}
		if(count<3) System.out.println("bilangan "+angka+" "+"adalah prima");
		else System.out.println("bilangan "+angka+" "+"bukan prima");
		input.close();
	}
}
