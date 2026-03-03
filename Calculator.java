import java.util.*;
import java.util.Scanner;
public class Calculator{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        //Calculate Square of number
        System.out.println("Enter any Number");
        double num = sc.nextDouble();
        double square = num * num;
        System.out.println("Square root is : " +square);

        //Currency Doller to rupees
        System.out.println("Enter Ammount:");
        double rupees = sc.nextDouble();
        double doller = rupees/83;
        System.out.println("Amount in rupees is :"+doller);

        System.out.println("Enter First Number:");
        double a = sc.nextDouble();
        sc.nextLine();

        System.out.println("choose an Operator ( + , - , * , / ) ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter Second Number:");
        double b = sc.nextDouble();
        double result;

        switch(operator){
            case '+' : result = a + b;
            System.out.println("Result="+result);
            break;

            case '-' : result = a-b;
            System.out.println("Result="+result);
            break;

            case '*' : result = a * b;
            System.out.println("Result="  +result);
            break;

            case '/' :

            if(b!=0){
                result = a/b;
            
            System.out.println("Result=" +result);
            
         }else{
            System.out.println("Cannot Divide by Zero ! ");
        }
        break;

            //case 'root' :result = a*a;

            default :
                System.out.println("INVALID OPERATOR");
            }
        }
    }