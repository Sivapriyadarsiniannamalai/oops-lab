import java.util.*;
class arithmetic
        {
         public static void main(String args[])
         {
          int a,b,sum=0,difference=0,multiplication=0,division=0;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter two numbers");
          a=sc.nextInt();
          b=sc.nextInt();
          sum=a+b;
          difference=a-b;
          multiplication=a*b;
          division=a/b;
          System.out.println("sum"+sum);
          System.out.println("difference"+difference);
          System.out.println("multiplication"+multiplication);
          System.out.println("division"+division);
         }
        }


