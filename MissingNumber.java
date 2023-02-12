import java.util.Arrays;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n-1;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(int j=x[i]+1;j<x[i+1];j++)
            {
                System.out.println(j+" ");
            }
        }
    }
}
