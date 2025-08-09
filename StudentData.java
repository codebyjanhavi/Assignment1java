//COPY CONSTRUCTOR

import java.util.*;
public class StudentData {
//global variables,global to class
int stu_id;
String name;
int fees;

public StudentData(int id, String n, int f) {

stu_id = id;
name = n;
fees =f;
System.out.println("Student id : "+stu_id+" \n Name : "+name+" \n Fees : "+fees);
}
//copy constructor
public StudentData(StudentData obj){

stu_id= obj.stu_id;
name = obj.name;
fees = obj.fees;

System.out.println("\nStudent id : "+stu_id+" \n Name : "+name+" \n Fees : "+fees);
}
public static void main(String args[]){

StudentData s = new StudentData(111, "Diksha", 10000);
StudentData s1 = new StudentData(s); // copy constructor , paasing object as parameter to copy constructor
}
}