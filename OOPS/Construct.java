public class Construct {
    public static void main(String[] args) {
        Student s1 = new Student("Pratik");
        System.out.println(s1.name);
    }
}

class Student{
    String name;
    
    Student(String name){
        this.name = name;
    }
}
