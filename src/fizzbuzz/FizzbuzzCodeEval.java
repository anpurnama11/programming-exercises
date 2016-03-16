package fizzbuzz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * solution for fizzbuzz problem at codeeval.com
 */

public class FizzbuzzCodeEval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader filereader;
		String line="";
		String num[];
		String ans=" ";
		int x=0;
		int y=0;
		int n=0;
		if(args.length>0)
			try {
				filereader= new FileReader(args[0]);
				BufferedReader bufferedReader = new BufferedReader(filereader);
				while((line=bufferedReader.readLine())!=null)
				{
					num=line.split(" ");
					x=Integer.parseInt(num[0]);
					y=Integer.parseInt(num[1]);
					n=Integer.parseInt(num[2]);
					for(int i=1;i<=n;i++)
					{
						if(i%x==0 && i%y==0) ans=ans+" "+"FB";
						else if(i%x==0)ans=ans+" "+"F";
						else if(i%y==0) ans=ans+" "+"B";
						else ans=ans+" "+String.valueOf(i);
					}
					System.out.println(ans.trim());
					ans=" ";
				}
				bufferedReader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
