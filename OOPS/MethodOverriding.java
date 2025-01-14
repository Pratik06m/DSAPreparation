public class MethodOverriding {
    public static void main(String[] args) {        // Run time Polymorphism
        Bird b = new Bird();
        b.eat();
    }
}
class Animal {
    void eat(){
        System.out.println("Animal Eating");
    }
}
class Bird extends Animal{
    void eat(){
        System.out.println("Bird Eating");
    }
}
