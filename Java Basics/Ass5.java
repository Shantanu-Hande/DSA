import java.util.*;

public class Ass5{

    public static double calculateAverage(double a, double  b, double c){
        double avg = (a+b+c)/3;
        System.out.println("Average of three numbers is "+ avg);
        return avg;
    }

    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        } 
        return false;
    }

    public static boolean isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n!=0){
            int lastDigit = n % 10;
            rev = (rev*10)+lastDigit;
            n /= 10; 
        }

        if(rev == original){
            return true;
        }
        return false;
    }

    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }



    public static void main(String args[]){
        System.out.println(sumOfDigits(121));
        
    }
}