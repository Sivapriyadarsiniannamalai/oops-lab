import java.util.*;


class fibonacci implements Runnable

{
 public void run()
 {
  int num1=0,num2=1;
  System.out.println("Fibonacci series:");
  for(int i=0;i<10;i++)
  {
   System.out.println(num1 + " ");
   int nextnum=num1+num2;
   num1=num2;
   num2=nextnum;
  }
 }
}
class evennumber implements Runnable
{ 
 public void run()
 {
  System.out.println("even no between 1 & 10 are:");
  for(int j=1;j<10;j++)
  {
   if(j%2==0)
   {
    System.out.println(j + " ");
   }
  }
 }
}

public class run
{
 public static void main(String args[])
 {
  fibonacci fib = new fibonacci();
  evennumber eve = new evennumber();
  Thread tfib = new Thread(fib);
  Thread teve = new Thread(eve);
  tfib.start();
  teve.start();
 }
}
