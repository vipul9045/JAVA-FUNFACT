import java.util.Scanner;
public class Sqaure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println(" enter length ");
      int length = sc.nextInt();
      System.out.println(" enter breath");
      int breath = sc.nextInt();
      if (length == breath){
        System.out.println("it is a square");
      }
      else {
        System.out.println("it is not a square");
      }
    }
}
