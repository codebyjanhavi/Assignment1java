import java.util.*;
class student1{
	int roll;
	String name;
	int marks;
public student1(int roll,String name,int marks)
    {
	this.roll=roll;
	this.name= name;
	this.marks=marks;
    }

public void display()
   { 
	System.out.println("Roll no: "+roll+" Name: "+name+" Marks: "+marks);
   }

public static void main(String args[])
   {	Scanner sc= new Scanner(System.in);
	System.out.println("Enter roll no:");
	int r= sc.nextInt();
	System.out.println("Enter name:");
	String n= sc.next();
	System.out.println("Enter marks:");
	int m= sc.nextInt();
	student1 s1= new student1(r,n,m);
	s1.display();
   }
}