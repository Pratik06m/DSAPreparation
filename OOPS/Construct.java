import javax.management.remote.SubjectDelegationPermission;

public class Construct {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Pratik");
        Student s3 = new Student(123);
        
        
        Student s4 = new Student(s2);   //Copy Connstructor
        System.out.println(s4.name);
        
        
        System.out.println(s2.name);
        System.out.println(s3.rollno);




        
    }
}

class Student{
    String name;
    int rollno;
    String pass;
    int marks[]; 

    Student(Student s2){    //Copy Connstructor
        this.name = s2.name;
    }


    Student(){          // Non parameterized
        System.out.println("Jay shree Ram");
    }
    Student(String name){   // Parameterized
        this.name = name;
    }
    Student (int rollno){   
        this.rollno = rollno;
    }
}
