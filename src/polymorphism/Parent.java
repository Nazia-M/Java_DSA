package polymorphism;


//Method Overiding
public class Parent {
    void Print(){
        System.out.println("Parent class");
    }
}
class subclass1 extends Parent{
    void Print(){
        System.out.println("Subclass1 class");
    }
}
class Test6{
    public static void main(String[] args) {
        Parent sb = new subclass1();
        sb.Print();

    }
}
