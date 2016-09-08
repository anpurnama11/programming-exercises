package numberOp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader filereader;
		String num[];
		String line="";
		int x=0;
		int n=0;
		int i;
		int res;
		if(args.length>0)
			try {
				filereader= new FileReader(args[0]);
				BufferedReader bufferedReader = new BufferedReader(filereader);
				while((line=bufferedReader.readLine())!=null)
				{
					num=line.split(",");
					x=Integer.parseInt(num[0]);
					n=Integer.parseInt(num[1]);
					i=1;
					while(true)
					{
						if(multipleOf(i, n)==0)
						{
							System.out.println(i+","+n);
							res=i*n;
							if(res>x || res==x)
							{
								System.out.println(res);
								break;
							}
						}
						res=0;
						i++;
					}
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
	
	private static int multipleOf(int i, int n)
	{
		while(i>0) i=i-n;
		return i;
	}

}
