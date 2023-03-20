package inheritance;

public class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}
class Parent extends Grandparent {
    public void Print() {
        super.Print();
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {
    public void Print() {
        super.Print();
        System.out.println("Child's Print()");
    }
}

class Test6 {
    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}