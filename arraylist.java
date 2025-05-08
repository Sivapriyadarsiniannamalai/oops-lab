import java.util.*;

	public class arraylist
		{
		public static void main(String args[])
		{
		 ArrayList<String>a1=new ArrayList<>();
		 Scanner sc = new Scanner(System.in);
		 a1.add("apple");
		 a1.add("mango");
		 a1.add("grapes");
		 a1.add("dragon fruit");
		 a1.add("banana");
		 System.out.println("Existing elements" +a1);
		 String name=sc.nextLine();
		 a1.add(name);
		 System.out.println("After insertion" +a1);
		 System.out.println("enter elements to remove:");
		 String S=sc.nextLine();
		 a1.remove(S);
		 System.out.println("After removing:"+a1);
		 Collections.sort(a1);
		 System.out.println("after sorting"+a1);
		 System.out.println("Enter elements to search");
		 String search=sc.nextLine();
		 if(a1.contains(search))
		 	{
		  		System.out.println("Element" + search +"found in list");
		 	}
		 else
		 	{
		  	System.out.println("Element s not found");
		 	}
		}
	}

