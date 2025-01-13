public class Inheritance1 {
    public static void main(String[] args) {
        Fish Poplet = new Fish();
        Poplet.eat();
        Poplet.swim();
    }
}

class Animal {
    String color;

    void eat(){
        System.out.println("Eating");
    }

    void breath(){
        System.out.println("Breathing");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swimming");
    }
}
