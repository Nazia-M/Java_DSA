package inheritance;

public class BaseClassWithArg {
    int x;

    BaseClassWithArg(int x){
        x = x;
    }
}
class Derived3 extends BaseClassWithArg{
    int y;
    Derived3(int x, int y){
        super(x);
        y=y;
    }
    void Display(){
        System.out.println("x : "+x+" y : "+y);
    }
}

class Test2{
    public static void main(String[] args) {
        Derived3 d = new Derived3(10,20);
        d.Display();
    }
}