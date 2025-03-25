import java.util.*;
public class area
{
 public void Area(int length,int breadth)
 {
  int Area=length * breadth;
  System.out.println("Area of rectangle:"+Area);
 }
 public void Area(int side)
 {
  int Area=side * side;
  System.out.println("Area of square:"+Area);
 }
 public void Area(double base1,double base2,double height)
 {
  double Area=0.5 *(base1+base2) * height;
  System.out.println("Area of trapezium:"+Area); 
 }
 public static void main(String args[])
 {
  area cal=new area();
  Scanner sc=new Scanner(System.in);
  System .out.println("Enter the length:");
  int length=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter the breadth:");
  int breadth=sc.nextInt();
  sc.nextLine();
  cal.Area(length,breadth);
  System.out.println("Enter the side:");
  int side=sc.nextInt();
  sc.nextLine();
  cal.Area(side);
  System.out.println("Enter the base1,base2,height:");
  double base1=sc.nextDouble();
  sc.nextLine();
  double base2=sc.nextDouble();
  sc.nextLine();
  double height=sc.nextDouble();
  sc.nextLine();
  cal.Area(base1,base2,height);
 }
}
  
  
 
