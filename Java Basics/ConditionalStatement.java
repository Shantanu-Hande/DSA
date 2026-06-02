import java.util.*;

public class ConditionalStatement{
    public static void main(String args []){
        // if else statement
       /*
        int age = 16;

        if(age>=18){
            System.out.println("You are an adult !! ");
        }
        if(age > 13 && age<18){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are not an adult");
        }
        

       int a = 200;
       int b = 20;

       if(a >= b){
          System.out.println("A is the largest number");
       }else{
          System.out.println("B is the largest number ");
       }
       
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      if(n % 2 == 0){
           System.out.println("the number is Even");
      } else{
           System.out.println("the number is odd");
      }
      */
        
      /*

      // else if statement
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your income : ");
       int income = sc.nextInt();
       int tax ;

       if(income < 500000){
          tax = 0;
       } 
       else if(income >= 500000 && income < 1000000){
          tax = (int) (income * 0.2);
       } 
       else{
          tax = (int) (income * 0.3);
       }

       System.out.println("your tax is " + tax);
       */

      /*
      int number = 9;
       // ternary operator

       String type = (number % 2 == 0) ? "Even" : "Odd";
       System.out.println(type);
       

      int marks = 33;

      String reportcard = (marks >= 33) ? "Pass" : "Fail";
      System.out.println(reportcard);
      */

     // switch case
     /*
      int number = 2;

      switch(number){
         case 1 : System.out.println("Samosa");
                  break;
         case 2 : System.out.println("Burger");
                  break;
         case 3 : System.out.println("Mango Shake ");
                  break;
         default : System.out.println("We Wake Up !!!");
      }
      */

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number a : ");
     int a = sc.nextInt();
     System.out.print("Enter number b : ");
     int b = sc.nextInt();
     System.out.print("Enter a operator : ");
     char operator = sc.next().charAt(0);

     switch(operator){
      case '+' : System.out.println(a+b);
                  break;
      case '-' : System.out.println(a-b);
                  break;
      case '*' : System.out.println(a*b);
                  break;
      case '/' : System.out.println(a/b);
                  break;
      case '%' : System.out.println(a%b);
                  break;
      default  : System.out.println("Wrong Operator !!! ");             
      }

    }
}