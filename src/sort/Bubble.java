package sort;

import java.util.Scanner;

/*
 * solution for bubble sort problem
 */

public class Bubble {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] num=new int[input.nextInt()];
		for(int i=0;i<num.length;i++)
		{
			num[i]=input.nextInt();
		}
		int temp=0;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(num[i]+" ");
		}
		input.close();
	}
}
