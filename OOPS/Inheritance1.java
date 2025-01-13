public class Inheritance1 {
    public static void main(String[] args) {
        Fish Poplet = new Fish(); //Single Level Inheritance
        Poplet.eat();
        Poplet.swim();

        Dog sheru = new Dog();
        sheru.bark();
        sheru.legs = 5;
        System.out.println(sheru.legs);
    }
}


class Animal { // Base Class | Parent Class
    String color;

    void eat(){
        System.out.println("Eating");
    }

    void breath(){
        System.out.println("Breathing");
    }
}

class Fish extends Animal{      //Single Level Inheritance    Derived class | Child Class
    int fins;

    void swim(){
        System.out.println("Swimming");
    }
}

class Mammal extends Animal{ // Derived class | Child Class
    int legs;
}
class Dog extends Mammal{       //Multi Level Inheritance 
    void bark(){
        System.out.println("Barking");
    }
}