package constructors;

public class thisConstOverloading {

    double width, height, depth;
    int boxNo;

    thisConstOverloading(double w, double h, double d, int num)
    {
        width = w;
        height = h;
        depth = d;
        boxNo = num;
    }

    thisConstOverloading()
    {
        width = 10;
        height = 5;
        depth = 3;

    }

    thisConstOverloading(int num)
    {
        // this() is used for calling the default constructor from parameterized constructor
        this();

        System.out.println(width);
        boxNo = num;
    }

    public static void main(String[] args)
    {
        thisConstOverloading box1 = new thisConstOverloading(1);

        System.out.println(box1.width);

    }
}
