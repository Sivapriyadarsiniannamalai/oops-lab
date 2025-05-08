import java.util.*;
public class palindrome
{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter number or word:");
String reverse ="";
String num=sc.nextLine();
int length=num.length();
for (int i=length-1;i>=0;i--)
{
reverse=reverse+num.charAt(i);
}
if(num.equals(reverse))
{
System.out.println("entered string"+num +" is a palindrome");
}
else
{
System.out.println("entered string "+num +" is not a palindrome");
}
}
}


