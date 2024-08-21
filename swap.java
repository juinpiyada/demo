import java.util.Scanner;
class swap
{ public static void main(String args[])
  { int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number1:");
    System.out.println("enter the next number");
    a=sc.nextInt();
    b=sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("First number: " + a);
        System.out.println("Second number: " + b);




  }
}