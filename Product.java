import java.util.*;
class product
{
 int pcode;
 float price;
 String pname;
 void getdata()
 {
  System.out.println("Enter pcode,pname,price");
  Scanner sc = new Scanner(System.in);
  this.pcode = sc.nextInt();
  sc.nextLine();
  this.pname = sc.nextLine();
  this.price = sc.nextFloat();
 }
}
class Product
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  product p1 = new product();
  p1.getdata();
  product p2 = new product();
  p2.getdata();
  product p3 = new product();
  p3.getdata();
  if(p1.price<p2.price && p1.price<p3.price)
  {
   System.out.println("Product1 is the lowest");
  }
  else if(p2.price<p3.price)
  {
   System.out.println("Product 2 is the lowest");
  }
  else
  {
   System.out.println("Product 3 is the lowest");
  }
 }
}
