package constructors;

public class constructorChainingSuper {
    String name;

    constructorChainingSuper()
    {
        this("");
        System.out.println("No-argument constructor of" +" base class");
    }

    constructorChainingSuper(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"+ " of base");
    }
}
class Derived extends constructorChainingSuper
{
    Derived()
    {
        System.out.println("No-argument constructor " +
                "of derived");
    }

    Derived(String name)
    {
        super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived");
    }

    public static void main(String args[])
    {
        Derived obj = new Derived("test");
    }
}