public class Polymorphism{
    public static void main(String args[]){
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum(1.73,2.54));
        System.out.println(c1.sum(1,2,5));
        Deer deer = new Deer();
        deer.eat();
    }

} 

//Method Overloading - Compile time polymorphism
class Calculator {
    int sum(int a , int b){
        return a + b;
    }

    double sum(double  a , double b){
        return a + b; 
    }

    int sum(int a , int b , int c){
        return a+b+c ;
    }
}

//Method Overriding - Run time polymorphism
class Animal{
    String color;

    void eat(){
        System.out.println("Eats...");
    }
}

class Deer extends Animal{
    int horns;
    
    @Override
    void eat(){
        System.out.println("Eats Grass...");
    }
}
