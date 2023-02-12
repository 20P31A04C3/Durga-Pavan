import java.util.Scanner;
public class Inventorymanagement{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String prodList[]={"watches","laptop","Ac"};
    int len=prodList.length;
    int prodCount[]={150,300,450};
    String prodDetails[]={"fasttrack , 4000RS/-","HP - 512 GB, 68000Rs/-","AI - 39 inches, 47000Rs/-"};
    int i;
    for(i=0;i<len;i++)
    {
        for(i=0;i<len;i++)
        {
        System.out.println(prodList[i]+" - "+prodCount[i]);
    }
}
System.out.println();
System.out.println("Enter 1 for watches:");
System.out.println("Enter 2 for laptop:");
System.out.println("Enter 3 for Ac:");
int enter=sc.nextInt();
if(enter==1)
System.out.println(prodDetails[0]);
else if(enter==2)
System.out.println(prodDetails[1]);
else if(enter==3)
System.out.println(prodDetails[2]);
else
System.out.println("product not found");
System.out.println();
System.out.println("enter for discount:");
int dis=sc.nextInt();
if(enter==1)
System.out.println("15% discount for "+prodDetails[0]);
else if(enter==2)
System.out.println("18% discount for "+prodDetails[1]);
else if(enter==3)
System.out.println("20% discount for "+prodDetails[2]);
else
System.out.println("product not found");
System.out.println("\nproducts are sold");
int soldproducts=100;
for(i=0;i<len;i++)
{
    System.out.println(prodCount[i]-soldproducts+" "+prodList[i]);
}
System.out.println("\nnew products arrived");
int addproducts=15;
for(i=0;i<len;i++)
{
    System.out.println(prodCount[i]+addproducts+" "+prodList[i]);
}
}
}
