import java.util.* ;

public class Input{
    public static void main(String args[]){
        System.out.print("Enter a name: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);

        Boolean var = sc.nextBoolean();
        System.out.println(var);
    }
}