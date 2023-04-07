package java;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator; 
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double ans = sc.nextDouble();
        System.out.println(" enter an operator ");
        char op = sc.next().charAt(0);
        System.out.println(" enter the first number ");
        double num_1 = sc.nextDouble();
        System.out.println(" enter the second number ");
        double num_2 = sc.nextDouble();
        switch(op){
            // for addition
            case '+' :
            ans = num_1 + num_2;
            System.out.println(num_1 + "  " + "+" + "  " + num_2 + "  " + "=" +  ans);
            break;
            // for subtraction
            case '-' :
            ans = num_1 - num_2;
            System.out.println(num_1 + "  " + "-" + "  " + num_2 + "  " + "=" +  ans);
            break;
            // for multiplication
            case '*' :
            ans = num_1 * num_2;
            System.out.println(num_1 + "  " + "*" + "  " + num_2 + "  " + "=" +  ans);
            break;
            // for division
            case '/' :
            ans = num_1 / num_2;
            System.out.println(num_1 + "  " + "/" + "  " + num_2 + "  " + "=" +  ans);
            break;
            // for modulo
            case '%' :
            ans = num_1 % num_2;
            System.out.println(num_1 + "  " + "%" + "  " + num_2 + "  " + "=" +  ans);
            break;
            default :
            System.out.println(" ERROR ! the operator is not correct " );
            break;

        }


    }
    
}
