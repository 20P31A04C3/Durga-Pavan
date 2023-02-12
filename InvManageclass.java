import java.util.Scanner;
class prodList{
    String prod1="watches";
    String prod2="Laptops";
    String prod3="Ac";
}
class prodCount extends prodList{
    int prod1=150;
    int prod2=300;
    int prod3=450;
}
class prodDetails extends prodList{
    String prod1="fasttrack , 4000RS/-";
    String prod2="HP - 512 GB, 68000Rs/-";
    String prod3="AI - 39 inches, 47000Rs/-";
}
public class InvManageclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sold=200;
        int added=200;
        prodList list=new prodList();
        prodCount count=new prodCount();
        prodDetails details=new prodDetails();
        System.out.println(list.prod1+" - "+count.prod1);
        System.out.println(list.prod2+" - "+count.prod2);
        System.out.println(list.prod3+" - "+count.prod3);
        System.out.println();
        System.out.println(list.prod1+" - "+details.prod1);
        System.out.println(list.prod2+" - "+details.prod2);
        System.out.println(list.prod3+" - "+details.prod3);
        details.prod1=" \n10% Discount on watches ";
        System.out.println(details.prod1);
        details.prod2=" \n15% Discount on Laptops ";
        System.out.println(details.prod2);
        details.prod3=" \n25% Discount on Ac ";
        System.out.println(details.prod3);
        System.out.println(); 
        add(added,count.prod1);
        add(added,count.prod2);
        add(added,count.prod3);
        System.out.println();
        sold(sold,count.prod1);
        sold(sold,count.prod2);
        sold(sold,count.prod3);
    }
    public static void add(int i,int j){
        System.out.println("Added Products - "+(i+j));
    }
    public static void sold(int i,int j){
        System.out.println("sold Products - "+(i-j));
    }
}
