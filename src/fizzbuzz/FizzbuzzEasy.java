package fizzbuzz;

public class FizzbuzzEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=54;i++)
		{
			if(i%11==0 && i%1==0) System.out.println("Fizzbuzz");
			else if(i%11==0) System.out.println("fizz");
			else if(i%1==0) System.out.println("buzz");
			else System.out.println(i);
		}
	}

}
