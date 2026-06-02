import java.util.*;

public class Total{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number a: ");
        int a = sc.nextInt();

        System.out.print("Enter Number b: ");
        int b = sc.nextInt();

        int sum = a + b;

        int product =  a * b;
        System.out.println("The product of a & b is " +  product);


    }
}