package inheritance;

public class Bicycle {
    int gear;
    int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public String printGearAndSpeed()
    {
        return ("No of gears are " + gear + " : "+ "speed of bicycle is " + speed);
    }

}
class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gear, int speed,int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method of Bicycle to print more info
    @Override public String printGearAndSpeed()
    {
        return (super.printGearAndSpeed() + "\n: seat height is "+ seatHeight);
    }
}

class Test {
    public static void main(String args[])
    {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.printGearAndSpeed());

    }
}
