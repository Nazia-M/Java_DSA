package constructors;

public class constructorChainingThis {

    constructorChainingThis()
    {
        this(5);
        System.out.println("The Default constructor");
    }

    constructorChainingThis(int x)
    {
        this(5, 15);
        System.out.println(x);
    }

    constructorChainingThis(int x, int y)
    {
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        new constructorChainingThis();
    }
}
