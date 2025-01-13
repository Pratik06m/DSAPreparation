public class Polymorphism {     //Compile Time Polymorphism
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(10, 20));
        System.out.println(calc.sum((float)10.10, (float) 20.50));

        System.out.println(calc.sum(10, 20, 30));

    }
}
// Method Overriding
class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum (float a, float b){
        return a+b;
    }
    
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
