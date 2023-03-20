package inheritance;

public class Employee {

    int salary = 100000;
}

class Engineer extends Employee{
    int bonus = 500000;
}
class Pack {
    public static void main(String[] args) {
        //During Inheritance only object of subclass is created and not superclass
        //When we create object of sub-class, a copy of all methods and fields of superclass acquire memory
        // That is why by creating object of sub-class we can access members of superclass
        Engineer eng = new Engineer();
        System.out.println("Salary : " + eng.salary+ " Bonus : " + eng.bonus);
    }
}
