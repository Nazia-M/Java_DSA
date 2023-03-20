package inheritance;

public class BaseClassNoArg {
    BaseClassNoArg(){
        System.out.println("Base class constructor");
    }
}
class Derived extends BaseClassNoArg{
    Derived(){
        System.out.println("Derived class constructor");
    }
}
class Derived1 extends Derived{
    Derived1(){
        System.out.println("Derived 1 class constructor");
    }
}
class Test1{
    public static void main(String[] args) {
        Derived1 d = new Derived1();
    }
}
