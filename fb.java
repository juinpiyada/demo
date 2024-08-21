import java.util.Scanner;
class fb
{
    public static void main(String args[])
    { int i,n,s1=0,s2=1 10,s3;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range");
        n=sc.nextInt();
        System.out.println(s1);
        System.out.println(s2);
        for(i=2;i<=n;i++)
        {
            s3=s1+s2;
            System.out.println(s3);
            s1=s2;
            s2=s3;
        }

        

    }
}


