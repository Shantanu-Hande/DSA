import java.util.*;

public class Functions{

    public static void printHelloWorld(){
        for (int i=1;i<=3;i++){
            System.out.println("Hello World!!!");
        }
    }

    public static int calculateSum(int num1 , int num2){//Parameter or formal parameter
        int sum = num1 + num2;
        System.out.println("Sum is : "+ sum); //int sum = calculateSum(a,b);//Arguments or actual parameters
        return sum;
    }

    public static int multiply(int a , int b){
        int product = a*b;
        return product;
    }
    
    public static int factorial(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
             f *= i;
        } 
        return f;
    
    }

    public static int binCoeff(int n , int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int bc = n_fact/(r_fact*nmr_fact);
        return bc;

    }
    
    //Function to calculate 2 nums
    public static int sum(int a , int b){
        return a+b;
    }

    //Functions to calculate 2 float values
    public static float sum(float a, float b){
        return a+b;
    }
    
    //Function to calculate 3 nums
    public static int sum(int a , int b , int c ){
        return a+b+c;
    }
    
    //Function to check prime number
    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }

        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeinRange(int n){
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }

        }
        System.out.println();

    }

    public static void BintoDec(int binNum){
        int MyNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;

        } 

        System.out.println("Decimal of " + MyNum + " is " + decNum);
    } 

    public static void DectoBin(int n){
        int MyNum = n;
        int pow = 0;
        int binNum = 0;

        while (n>0){
            int rem = n % 2;
            binNum = binNum + (rem*(int)Math.pow(10,pow));
             
            pow++;
            n /= 2;
        }
        System.out.println("The Binary of " + MyNum + " is " + binNum);

    }

    // Void(khali - null) is the returnType & Main is the function & String args[] is input its an array 
    public static void main(String args[]){
        DectoBin(10);
    }
}