import java.util.*;

class table extends Thread
{
 public void run()
 {
  for(int i=1;i<=10;i++)
  {
  int a=i*5;
  System.out.println("\n table:"+i+"*5"+"="+a);
  }
  System.out.println("Existing table");
 }
}
class prime extends Thread
{
 public void run()
 {
  int flag,i,j;
  for(j=2;j<25;j++)
  {
  flag=0;
  for(i=2;i<=(j/2);i++)
  {
   if(j%i==0)
   { 
   flag=1;
   break;
   }
  }
  if(flag==0)
  {
   System.out.println("Prime number:" +j);
  }
  }
  System.out.println("Existing prime number:");
 }
}
  public class thread
  {
   public static void main(String args[])
   {
    table t =new table();
    prime p = new prime();
    t.start();
    p.start();
   }
  }
  
