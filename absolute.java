package java;
import java.util.Scanner;
public class absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if ( n > 0){
            // logic for finding absolute value
            n = n*-1;
        }
        System.out.println("absolute value is" + "  " + n);
    }
    
}
