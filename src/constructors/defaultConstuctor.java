package constructors;

public class defaultConstuctor {

    int x;

    defaultConstuctor() {
        x=10;
        System.out.println("Default Constructor called x :"+x);
    }

    public static void main(String[] args)
    {
        defaultConstuctor dc = new defaultConstuctor();

    }
}
