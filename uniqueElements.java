import java.util.Scanner;
import java.util.Arrays;
public class uniqueElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[],j;
        int k=sc.nextInt();
        a=new int[k];
        for(int i=0;i<k;i++)
        a[i]=sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<k;i++)
        {
            for(j=0;j<i;j++)
            {
                if(a[i]==a[j])
                break;
        }

        if(i==j)
        System.out.print(a[i]+" ");
    }
    }
}
