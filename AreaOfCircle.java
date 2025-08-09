import java.util.*;
public class AreaOfCircle{
	double radius,result;
public double area(){
	result= 3.14*radius*radius;
	return result;
 }

public static void main(String args[]){
	AreaOfCircle a= new AreaOfCircle();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter radius");
	a.radius= sc.nextDouble();
	System.out.println("The area o the circle is:"+a.area());
    }
}

