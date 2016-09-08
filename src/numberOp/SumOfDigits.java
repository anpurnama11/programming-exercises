package numberOp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader filereader;
		String line="";
		char digit[];
		int sum=0;
		if(args.length>0)
			try {
				filereader= new FileReader(args[0]);
				BufferedReader bufferedReader = new BufferedReader(filereader);
				while((line=bufferedReader.readLine())!=null)
				{
					digit=line.toCharArray();
					for(int i=0;i<digit.length;i++) sum+=Character.getNumericValue(digit[i]);
					System.out.println(sum);
					sum=0;
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
