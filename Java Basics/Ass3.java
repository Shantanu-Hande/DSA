import java.util.*;

public class Ass3{
    public static void main(String args[]){
        /*
        //WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        if(number >= 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        */

        /*
       //Youhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a fever
       double temp = 89;
        if(temp > 100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You dont have a fever");
        }
        */
        /*
       //WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a week number : ");
       int n = sc.nextInt();

       switch(n){
        case 1 : System.out.println("Monday");
                  break;
        case 2 : System.out.println("Tuesday");
                  break;
        case 3 : System.out.println("Wednesday");
                  break;
        case 4 : System.out.println("Thursday");
                  break;
        case 5 : System.out.println("Friday");
                  break;
        case 6 : System.out.println("Saturday");
                  break;
        case 7 : System.out.println("Sunday");
                  break;
        default : System.out.println("Invalid Week Number");          
       } 
       */

      //WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear is a leap year or no

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Year : ");
      int year = sc.nextInt();

      if((year%4==0 && year%100 != 0) || year%400 == 0){
        System.out.println("It is a leap year");
      }
      else{ 
        System.out.println("It is not an leap year");
      }

    }
}