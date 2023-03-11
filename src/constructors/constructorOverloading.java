package constructors;

public class constructorOverloading {
    constructorOverloading(String name)
    {
        System.out.println("One "+ "argument - String : " + name);
    }

    constructorOverloading(String name, int age)
    {

        System.out.println("Two arguments : "+ " String and Integer : " + name + " " + age);
    }

    constructorOverloading(long id)
    {
        System.out.println("One argument : "+ "Long : " + id);
    }
    public static void main(String[] args)
    {
        constructorOverloading co2 = new constructorOverloading("Nazia");

        constructorOverloading co3 = new constructorOverloading("M", 26);

        constructorOverloading co4 = new constructorOverloading(325614567);
    }
}
