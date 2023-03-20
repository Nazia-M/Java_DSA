package inheritance;

public class CallingObject {
    public void show(){
        System.out.println("Base show()");
    }
}
class Derived4 extends CallingObject{
    public void show(){
        System.out.println("Derived show()");
    }
}
class Test4{
    public static void main(String[] args) {
        CallingObject co = new Derived4();
        co.show();
    }
}
