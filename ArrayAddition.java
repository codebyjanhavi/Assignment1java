import java.util.*;

public class ArrayAddition {
    public static void main(String args[]) {
        int a[] = new int[5];
        int add = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            a[i] = s.nextInt();  
            add = add + a[i];    
        }

        System.out.println("Addition is: " + add);
    }
}



