package string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * solution for reverse string problem at codeeval.com
 */

public class ReverseStringCodeEval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader filereader;
		String line="";
		String ans[];
		if(args.length>0)
			try {
				filereader= new FileReader(args[0]);
				BufferedReader bufferedReader = new BufferedReader(filereader);
				while((line=bufferedReader.readLine())!=null)
				{
					ans=line.split(" ");
					System.out.println(reverse(ans));
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
	
	private static String reverse(String ans[])
	{
		StringBuilder strBuilder = new StringBuilder();
		String newString = "";
		if(ans.length<3)
		{
			String temp=ans[0];
			ans[0]=ans[1];
			ans[1]=temp;
			for (int i = 0; i <ans.length; i++) {
				   strBuilder.append(ans[i]);
				   strBuilder.append(" ");
				}
			newString = strBuilder.toString();
			return newString;
		}
		String temp="";
		for(int i=0;i<ans.length/2;i++)
		{
			temp=ans[i];
			ans[i]=ans[ans.length-1-i];
			ans[ans.length-1-i]=temp;
		}
		for (int i = 0; i < ans.length; i++) {
			   strBuilder.append(ans[i]);
			   strBuilder.append(" ");
			}
		newString = strBuilder.toString();
		return newString;
	}

}
