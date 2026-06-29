import java.util.*;

public class List{

    // ArrayList --> we can add only from end
    // public static void main(String args[]){
    //     ArrayList<Integer> aList = new ArrayList<>();
    //     aList.add(3);
    //     aList.add(6);
    //     aList.add(80);
    //     System.out.println(aList.size());
    //     System.out.println(aList.get(2));
    //     System.out.println(aList.remove(1));
    //     System.out.println(aList);
    //     System.out.println(aList.contains(3));
    //     aList.add(2,3);
    //     System.out.println(aList);
    //     aList.clear();
    //     System.out.println(aList);
    // }
    
    // LinkedList --> we can add from both side
    // public static void main (String args[]){
    //     LinkedList<Integer> ll = new LinkedList<>();
    //     ll.add(20);
    //     ll.addFirst(10);
    //     ll.add(30);
    //     ll.addLast(40);
    //     System.out.println(ll);
    //     System.out.println(ll.size());
    //     System.out.println(ll.getFirst());
    //     System.out.println(ll.getLast());
    //     System.out.println(ll.contains(60));
    //     ll.removeFirst();
    //     ll.removeLast();
    //     System.out.println(ll);
    //     System.out.println(ll.getLast());
    //     ll.clear();
    //     System.out.println(ll);
    // }

    // Stack --> LIFO (Last in First Out)
    // public static void main(String args[]){
    //     Stack<Integer> st = new Stack<>();
    //     st.push(3);
    //     st.push(7);
    //     st.push(9);
    //     System.out.println(st);
    //     st.peek();
    //     System.out.println(st.peek());
    //     st.pop();
    //     System.out.println(st);
    //     System.out.println(st.isEmpty());
    //     SystemSt.out.println(st.size());
    //     st.clear();
    //     System.out.println(st);
    // }

    //Vector --> Thread Safe
    public static void main (String args[]){
        Vector<Integer> vec = new Vector<>();
        vec.add(10);
        vec.add(20);
        System.out.println(vec.size());
        vec.remove(1);
        System.out.println(vec);
    }
}