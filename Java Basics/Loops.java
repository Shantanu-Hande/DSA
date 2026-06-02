import java.util.*;

public class Loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // While Loop
        /*
        int counter = 0;

        while (counter<5){
          System.out.println("Hello World");
          counter++;
        }

        Syste.out.println("Printed Hello World 5x");
        */
        /*
       int n = 1;
       while (n<=100){
        System.out.print(n+" ");
        n++;
       }
       System.out.println();
       */
      /*
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      int count = 1;

      while(count <= n){
        System.out.print(count + " ");
        count++;
      }
      */
        /*
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
        */

       // For Loop
        /*
       for(int i = 1; i<=10;i++){
        System.out.println("Hello World");
       }
       */
        /*
       for (int lines = 1; lines<=4;lines++){
            System.out.println("****");
       }
       */
       /*
       int n = 101004;

       while(n > 0){
        int lastDigt = n%10;
        System.out.print(lastDigt);
        n /= 10;
       }
       */
        /*
      int n = 101004;
      int rev = 0;

      while(n > 0){
        int lastDigit = n%10;
        rev = (rev*10)+lastDigit;
        n/=10;
      }

      System.out.print(rev);
      */
    
       // Do While Loop
       /*
       int count = 1;
       do{
        System.out.println("Hello World");
        count++;
       }while(count<=10);
        */ 

      // Break
      /*
       for(int i = 1;i<=5;i++){
           if(i == 3){
            break;
           }
           System.out.println(i);
       }
       */
        /*
       do{
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if(n%10 == 0){
                break;
            }
            System.out.println(n);
       }while(true);
       */
       /*
      for(int i = 1;i<=5;i++){
        if(i==3){
            continue;
        }
        System.out.println(i);
      }
      */

       do{
            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            if(n%10==0){
            continue;
            }

            System.out.println("the number was " + n);
       }while(true);

    }
}       