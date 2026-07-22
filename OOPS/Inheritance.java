public class Inheritance {
    public static void main(String args[]){
       Dog rocky = new Dog();
       rocky.eat();
       rocky.legs = 4;
       System.out.println(rocky.legs);
    }
}

//Base class
class Animal {
    String color;

    void eat(){
        System.out.println("eats...");

    }
    void breath(){
        System.out.println("breathes...");
    }
}
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("walks...");
    }
}
class Dog extends Mammals{
    int breed;
}

//Derived class /sub - class  
class Fish extends Animal {
    int fins;

    void swin(){
        System.out.println("Swims in water");
    }
}

class Birds extends Animal{
    void fly(){
        System.out.println("Flys...");
    }
}

//Single Level Inheritance :- Animals -> Mammals
//Multi Level Inheritance :- Animals -> Mammals -> Dog
//Hierarchical Inheritance :- Animals -> Mammals && Fish && Birds
//Hybrid Inheritance :- Its a mix type of inheritance
//Multiple Inheritance :- Cannot be implemented here, can be done via Abstraction