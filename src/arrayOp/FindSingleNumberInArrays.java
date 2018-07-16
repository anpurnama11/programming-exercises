package arrayOp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindSingleNumberInArrays {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String number=input.nextLine();
		input.close();
        char[] inputs = number.toCharArray();
        List<Integer> ans = getSingleNumbers(inputs);
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        for(int n: ans)
        	builder.append(String.valueOf(n));
        builder.append(")");
        System.out.print(builder.toString());
	}

	private static List<Integer> getSingleNumbers(char[] inputs) {
		List<Integer> seens = new ArrayList<>(inputs.length);
		for(int i=0;i<inputs.length;i++) {
			int number = Character.getNumericValue(inputs[i]);
			if(seens.contains(number))
				remove(seens,number);
			else
				seens.add(number);
		}
		return seens;
	}

	private static void remove(List<Integer> list, int number) {
		for(int i=0;i<list.size();i++)
			if(list.get(i)==number)
				list.remove(i);
	}
}
