class student{
	int roll;
	String name;
	int marks;
public student(int roll,String name,int marks)
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
   {	
	student s1= new student(141, "janhavi", 40);
	s1.display();
   }
}