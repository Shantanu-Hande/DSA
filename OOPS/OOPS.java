public class OOPS{

    public static void main(String args[]){
        Pen p1 = new Pen();//We created an object of the class Pen
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
       
    }
}

class BankAccount{
    public String username;
    private String password;

}

class Pen{
    private String color ;
    private int tip ;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}

class Student{

}