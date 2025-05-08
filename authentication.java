import java.util.*;

	class AuthenticationException extends Exception
		{
			public AuthenticationException(String message)
			{
				super(message);
			}
		}
	public class authentication
	{
	 static final String username="username";
	 static final String password="pass123";
	 public static void main(String args[])
	 {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter the name:");
	  String username=sc.nextLine();
	  System.out.println("Enter password:");
	  String password = sc.nextLine();
	  try
	  {
	   authenticate(username,password);
	   System.out.println("login successfully!!");
	  }
	  catch(AuthenticationException e)
	  {
	   System.out.println("Authentication failed" + e.getMessage());
	   
	  }
	 }
	 static void authenticate(String username,String password)throws AuthenticationException
	 {
	  if(username.isEmpty()||password.isEmpty())
	  {
	   throw new AuthenticationException("\n username and password cannot be blank");
	  }
	  if(username.length()<5)
	  {
	   throw new AuthenticationException("\n username should have max 5 characters."); 
	  }
	  if(!username.equals(username)||!password.equals(password))
	  {
	   throw new AuthenticationException("\n incorrect username or password");
	  }
	  if(password.length() <8)
	  {
	   throw new AuthenticationException("\n password should have more than 8 characters.");
	  }
	 }
	}
	
