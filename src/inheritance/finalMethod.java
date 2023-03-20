package inheritance;

public class finalMethod {
    final public void show(){
        System.out.println("Base show()");
    }
}
class Derived5 extends finalMethod{
//    public void show(){
//        System.out.println("Derived show()");
//    }
}
class test5{
    public static void main(String[] args) {
        finalMethod b = new Derived5();
        b.show();
    }
}
