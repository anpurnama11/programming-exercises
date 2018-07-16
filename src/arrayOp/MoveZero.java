package arrayOp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveZero {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] testCase = new int[n];
        List<Integer> ans = new ArrayList<>(n);
        for(int i=0;i<n;i++)
            testCase[i] = input.nextInt();
        for(int i=0;i<testCase.length;i++) {
            if(testCase[i]!=0)
                ans.add(testCase[i]);
        }
        for(int i=0; i<testCase.length; i++) {
            if(testCase[i]==0)
                ans.add(testCase[i]);
        }
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        for(int num: ans)
            builder.append(String.valueOf(num));
        builder.append(")");
        System.out.print(builder.toString());
    }
}
