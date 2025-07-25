import java.util.Scanner;

public class Swaptemp {
    public static void main(String[] args) {
	int temp;
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
	
	temp=a;
	a=b;
	b=temp;
        
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}
