package polymorphism;

public class Parent1 {
    void Print(int a, int b){
        System.out.println("Print int :"+a+" int :"+b);
    }
    void Print(double a, int b){
        System.out.println("Print int :"+a+" int :"+b);
    }
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.Print(1.5,5);

    }
}
