import java.util.*;
public class fibo{
	
	public static void main(String args[]){
	int a=0,b=1,c,n;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number up to which you want fibo series:");
	n= sc.nextInt();
	if(n<=0){
		System.out.println("Enter positive Number");
		}

	else if(n==1){
		System.out.println(a);
               }
	else{
	System.out.println(a);
	System.out.println(b);

		for(int i=2; i<n;i++){
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
     }
  }
}