package constructors;

class noArgConstructor {
        int num;
        String name;

        //Constructor would be invoked while an object of that class is created.
        noArgConstructor() {
            System.out.println("Default Constructor called");
        }

        public static void main(String[] args)
        {
            // Invoke default constructor.
            noArgConstructor geek1 = new noArgConstructor();

            // Default constructor provides the default values to the object like 0, null
            System.out.println(geek1.name);
            System.out.println(geek1.num);
        }
}