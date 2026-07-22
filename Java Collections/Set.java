import java.util.*;

public class Set{

    // Hashset --> DS that store unique elements in any random order
    // public static void main(String args[]){
    //     HashSet<Integer> hs = new HashSet<>();
    //     hs.add(2);
    //     hs.add(1);
    //     hs.add(2);
    //     hs.add(0);
    //     System.out.println(hs);
    //     hs.remove(1);
    //     for(var nums : hs){
    //         System.out.println(nums);
    //     }
    // }

    //TreeSet --> DS that store unique elemnts in sorted order
    public static void main (String args[]){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(3);
        ts.add(-1);
        ts.add(7);
        System.out.println(ts.floor(8)); //Print value <= 8
        System.out.println(ts.ceiling(8)); //Print value >= 8
        for(var nums : ts){
            System.out.println(nums);
        }
        ts.floor(8);
        ts.remove(9);
    }


}