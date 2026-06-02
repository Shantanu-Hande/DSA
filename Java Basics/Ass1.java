import java.util.*;

public class Ass1{
    public static void main(String args[]){
        //input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();

        float total_cost = pen+pencil+eraser;
        System.out.println("The toatl cost is " + total_cost);


    }
}
