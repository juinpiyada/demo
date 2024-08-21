import java.util.Scanner;
class ar
{ public static void main(String args[])
{ int i;
    int a[] = new int[5];

Scanner sc =new Scanner(System.in);
for(i=0;i<5;i++)
a[i]=sc.nextInt();
for(i=0;i<5;i++)
System.out.println("the array is "+a[i]);
}
 }