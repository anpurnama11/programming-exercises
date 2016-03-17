package numberOp;

/*
 * solution for Multiplication Tables problem at codeeval.com
 */

public class MultipleTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=12;i++)
		{
			for(int j=1;j<=12;j++)
			{
				if(j>=12) System.out.printf("%4s",i*j);
				else System.out.printf("%4s",i*j);
			}
			System.out.println();
		}
	}

}
