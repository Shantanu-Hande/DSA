import java.util.*;

public class Queue{

    // ArrayDeque --> Two ended DS
    // public static void main (String args[]){
    //     ArrayDeque<Integer> ad = new ArrayDeque<>();
    //     ad.offer(1);
    //     ad.offerFirst(2);
    //     ad.offerLast(4);
    //     System.out.println(ad);
    //     System.out.println(ad.peek());
    //     ad.pollLast();
    //     for(var nums : ad){
    //         System.out.println(nums);
    //     }
    // }

    //Linkedlist

    //Priority Queue --> Min Heap DS
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(7);
        pq.offer(2);
        pq.offer(-1);
        System.out.println(pq.peek());
        while(pq.isEmpty() == false){
            System.out.println(pq.peek());
            pq.poll();
        }

    }  
}