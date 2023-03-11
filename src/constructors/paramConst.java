package constructors;

public class paramConst {

    String name;
    int id;

    paramConst(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args)
    {
        paramConst pc = new paramConst("Nazia", 07);
        System.out.println("GeekName :" + pc.name  + " and GeekId :" + pc.id);
    }
}
