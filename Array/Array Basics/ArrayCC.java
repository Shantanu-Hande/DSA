import java.util.*;
 class ArrayCC{
    public static void main(String args[]){
        int numbers[] = {1, 2, 3};
        String fruits[] = {"Apple", "Mango", "Banana"};

        int marks[] = new int[100];

        marks[0] = 98; //phy
        marks[1] = 95; //chem
        marks[2] = 99; //maths

        System.out.println("Physics = " + marks[0]);
        System.out.println("Chemistry = " + marks[1]);
        System.out.println("Maths = " + marks[2]);

        marks[1] = marks[1] + 1; //Upadte in Array
        System.out.println("Chemistry = "+ marks[1]);

        System.out.println("Size of Array is " + marks.length);

    }
}