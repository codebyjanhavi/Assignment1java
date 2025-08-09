import java.util.*;
public class AreaOfRectangle{
	double length;
	double breadth;
	double result;
public double area(){
	result= length*breadth;
	return result;
   }

public static void main(String args[]){
	AreaOfRectangle a = new AreaOfRectangle();
	Scanner s= new Scanner(System.in);
	System.out.println("Enter length:");
	a.length= s.nextDouble();
	System.out.println("Enter breadth:");
	a.breadth= s.nextDouble();
	System.out.println("The area of the rectangle is:"+a.area());
	}
}
	
