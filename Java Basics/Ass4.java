import java.util.*;

public class Ass4{
    public static void main(String args[]){
        /*
        //Writeaprogram that reads a set of integers,and then prints the sum of the even and odd integers

        Scanner sc = new Scanner(System.in);
        int choice;
        int evensum = 0;
        int oddsum = 0; 

        do{
            System.out.print("Enter a number : ");
            int number = sc.nextInt();

            if (number % 2 == 0){
                evensum += number;
            }
            else{
                oddsum += number;
            }

            System.out.print("If want to continue press 1 else press 0 : ");
            choice = sc.nextInt();

        }while(choice == 1);

        System.out.println("Sum of even numbers : " + evensum);
        System.out.println("Sum of odd numbers : " + oddsum);
        */

       //Write a program to find the factorial of any number entered by the user
       /*
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int n = sc.nextInt();
       int fact = 1;

       for(int i=1;i<=n;i++){
            fact *= i;
       }

       System.out.println("The Factorial of number n is  "+ fact);
       */
        //WriteaprogramtoprintthemultiplicationtableofanumberN,enteredbytheuser
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n + "*"+ i + "="+ n*i );
        }
        */

       // Palindrome + reverse a string
       /*
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int num = sc.nextInt();
       int original = num;
       int rev = 0;

       while (num>0){
        int lastDigit = num%10 ;
        rev = (rev*10)+lastDigit;
        num /= 10;
       }

       if(rev == original){
          System.out.println("the number is plaindrome");
       }
       else {
          System.out.println("the number is not a palindrome");
       }
       */
        //Count how many times digit 7 appears in a number
        int n = 77239;
        int largestDigit = 0;

        while(n>0){
            int lastDigit = n%10;
            n /= 10;
            if (lastDigit>largestDigit){
                largestDigit = lastDigit;
            }
        }

        System.out.println(largestDigit);


    }
}