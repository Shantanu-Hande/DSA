import java.util.*;

public class Pattern1{
    public static void main(String args[]){

        //Star Pattern
        /*
        for (int lines = 1;lines<=4;lines++){
            for(int star = 1;star<=lines;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
       //Inverted Star Pattern
       /*
        int n = 7;
       for (int lines = 1;lines<=n;lines++){
          for(int star=1;star<=(n-lines+1);star++){
              System.out.print("*");
          }
          System.out.println();
       } 
       */

      //Half Pyramid Pattern Number
      /*
      int n = 5;
      for(int i=1;i<=n;i++){
        // Number print
        for(int j = 1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
      }
      */

      //Character Pattern
      /*
      int n = 4;
      char ch = 'A';
      for(int i = 1;i<=n;i++){
          for(int j = 1;j<=i;j++){
             System.out.print(ch);
          }
          ch++;
         System.out.println(); 
      }  
      */

       //Right Aligned Pattern 
       /*
       int n = 4;
       for(int i = 1;i<=n;i++){
          for(int j =1;j<=n-i;j++){
            System.out.print(" ");
          } 
          for(int j = 1;j<=i;j++){
            System.out.print("*");
          }
         System.out.println();
       }
       */
       //Inverted Right Aligned Pattern
       /*
       int n = 4;
       for(int i = 1;i<=n;i++){
          for(int j = 1;j<=i-1;j++){
            System.out.print(" ");
          } 
          for(int j = 1;j<=n-i+1;j++){
            System.out.print("*");
          }
         System.out.println();
       }
       */
      //One character right aligned pattern
      /*
      int n = 4;
      char ch = 'A';
      for (int i = 1;i<=n;i++){
           for(int j = 1;j<=n-i;j++){
            System.out.print(" ");
           }
           for(int j = 1;j<=i;j++){
            System.out.print(ch);
           }
           ch++;
           System.out.println();
      }
      */

      //Inverted half pyramid with number
      /*
      int n = 5;
      for(int i = 1;i<=n;i++){
        for (int j = 1; j<=n-i+1;j++){
          System.out.print(j);
        }
        System.out.println();
      } 
      */
      
      //Floyd Triangle
      int n = 5;
      int num = 1;
      for(int i = 1; i <= n;i++){
        for (int j = 1;j<=i;j++){
          System.out.print(num+" ");
          num++;
        }
        System.out.println();
      }


    }
}