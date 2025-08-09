import java.util.*;

public class Area{
	double height,base,result;
public double area(){
	result=(0.5)*(base*height);
	return result;
}
public static void main(String args[]){
	Area a= new Area();
	Scanner s= new Scanner(System.in);
	System.out.println("Ente the value of height and base:");
	a.base= s.nextDouble();
	a.height= s.nextDouble();
	System.out.println("The area of the triangle is:"+a.area());
   
	}
}	