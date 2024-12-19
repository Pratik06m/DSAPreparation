
public class classandobj {

    public static void main(String[] args) {
        Pen p1 = new Pen();     //created a pen object of the class
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.color = "Blue";
        System.out.println(p1.color);


    }
    
}

class Pen{
    String color;
    int tip;

    void setColor(String newClr){
        color = newClr;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
