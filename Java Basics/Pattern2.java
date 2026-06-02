import java.util.*;

public class Pattern2{

    public static void hollow_rectangle(int totRows , int totCols){
        //outer loop
        for(int i=1 ; i<=totRows ;i++ ){
            //inner loop
            for(int j = 1;j<=totCols;j++){
                //cell (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    //Boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n){
        //outer loop
        for(int i=1 ; i<=n ; i++ ){
            //Spaces inner loop
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            //Stars inner loop
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_number_pyramid(int n){
        //outer loop
        for(int i=1 ; i<=n ; i++){
            //inner loop
            for(int j=1 ; j<=n-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n){
        int count = 1;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void butterfly(int n){

        //1st Half Outer loop
        for(int i=1 ; i<=n ; i++){
            //inner loop

            //Stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            
            //Spaces
            for(int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //2nd Half Outer loop
        for(int i=n ; i>=1 ; i--){
            //inner loop

            //Stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            
            //Spaces
            for(int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }

    public static void solid_rhombus(int n){
        //Outer Loop
        for(int i=1 ; i<=n ; i++){

            //Spaces
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1 ; i<=n ; i++){

            //Spaces
            for(int j=1 ; j<=n-i ;j++){
                System.out.print(" ");
            }

            for(int j=1 ; j<=n ; j++){
                if( i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void diamond(int n){


        //1st Half Outer loop
        for(int i=1 ; i<=n ; i++){
            //Spaces
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1 ; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //2st Half Outer loop
        for(int i=n ; i>=1 ; i--){
          
            //Spaces
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1 ; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }



    public static void main(String ards[]){
       diamond(4);
    }
}