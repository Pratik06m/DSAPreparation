public class Construct {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Pratik");
        Student s3 = new Student(123);

        System.out.println(s2.name);
        System.out.println(s3.rollno);

        
    }
}

class Student{
    String name;
    int rollno;

    Student(){
        System.out.println("Jay shree Ram");
    }
    Student(String name){
        this.name = name;
    }
    Student (int rollno){
        this.rollno = rollno;
    }
}
