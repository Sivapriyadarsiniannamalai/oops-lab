 import java.util.*;
class person
{
	String Name,Gender,Address;
	int Age;
	person(String name,String gender,String address,int age)
	{
		this.Name=name;
		this.Gender=gender;
		this.Address=address;
		this.Age=age;
	}
}
class Employee extends person
{
	int Empid,Salary;
	String C_name,Qualification;
	Employee(String name,String gender,String address,int age,int empid,int salary,String c_name,String qualification)
	{
		super(name,gender,address,age);
		this.Empid=empid;
		this.Salary=salary;
		this.C_name=c_name;
		this.Qualification=qualification;
	}
}
class Teacher extends Employee
{
	String Subject,Dept;
	int Teacherid;
	Teacher(String name,String gender,String address,int age,int empid,int salary,String c_name,String qualification,String Subject,String dept,int teacherid)
	{
		super(name,gender,address,age,empid,salary,c_name,qualification);
		this.Subject=Subject;
		this.Dept=dept;
		this.Teacherid=teacherid;
	}

void display()
           {
		System.out.println("\nName:"+Name);
		System.out.println("\nGender:"+Gender);
		System.out.println("\tAddress:"+Address);
		System.out.println("\tEmpid:"+Empid);
		System.out.println("\tSalary:"+Salary);
		System.out.println("\tCompany name:\t"+C_name);
		System.out.println("\tQualification:"+Qualification);
		System.out.println("\tSubject:"+Subject);
		System.out.println("\tDepartment:"+Dept);
		System.out.println("\tTeacher id:"+Teacherid);
		
	}
}
class Person
{
 	public static void main(String args[])
 	{
 		
 		
 		int i,n;
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter number of teachers:");
 		n=sc.nextInt();
 		sc.nextLine();
 		Teacher[] teachers=new Teacher[n];	
 		for(i=0;i<n;i++)
 		{
 		System.out.println("Enter your name:");
 		String Name=sc.nextLine();
 		System.out.println("Enter your gender:");
 		String Gender=sc.nextLine();
 		System.out.println("Enter your address:");
 		String Address=sc.nextLine();
 		System.out.println("Enter your age:");
		int Age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee id:");
		int Empid=sc.nextInt();
		System.out.println("Enter salary:");
		int Salary=sc.nextInt();
		System.out.println("Enter company name:");
		String C_name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter qualification:");
		String Qualification=sc.nextLine();
		System.out.println("Enter subject:");
		String Subject=sc.nextLine();
		System.out.println("Enter department:");
		String Dept=sc.nextLine();
		System.out.println("Enter teacher id:");
		int Teacherid=sc.nextInt();
		sc.nextLine();
		teachers[i]=new Teacher(Name,Gender,Address,Age,Empid,Salary,C_name,Qualification,Subject,Dept,Teacherid);
		}
		for(i=0;i<n;i++)
		{
		     System.out.println("TEACHER DETAILS:");
		     teachers[i].display();
	          }
           }
}
