public class Abstraction{
    public static void main(String args[]){
        //Mustang m1 = new Mustang();
        // Queen q1 = new Queen();
        // q1.moves();
        // King k1 = new King();
        // k1.moves();
        Human Shantanu = new Human();
        Shantanu.eatPlant();
        Shantanu.eatMeat();

    }
} 


//Abstract Class & Constructor Called - Hierarchy
//Animal -> Horse -> Mustang
// abstract class Animal{
//     Animal(){
//         System.out.println("Animal Constructor is called");
//     }
//     void eat(){
//         System.out.println("eats...");
//     }

//     abstract void walk();
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse constructor is called");
//     }

//     void walk(){
//         System.out.println("Walk on 4 legs");
//     }
// }
// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang Constructor is called");
//     }
// }

//Interfaces
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("right,left,up,down,diagonal (in all 4 directions)");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("right,left,up,down,diagonal - (by 1 move)");
    }
}

//Multiple Inheritance Possible by Interface
interface Herbivours{
    void eatPlant();
}
interface Carnivours{
    void eatMeat();

}
class Human implements Herbivours,Carnivours{
    public void eatPlant(){
        System.out.println("Eats fruits,vegetable ");
    }
    public void  eatMeat(){
        System.out.println("Eats chicken,goat");
    }
}