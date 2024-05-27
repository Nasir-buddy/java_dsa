package OOPS4;
public class LearnAbstract{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.acceleration();
        c1.breaks(4);
    }
}
abstract class Vehicle{
    abstract void acceleration();
    abstract int breaks(int wheel);
}

class Car extends Vehicle {
    @Override // annotation
    void acceleration(){
        System.out.println("car is accelerating");
    }
    
    int breaks(int wheel){
        System.out.println(wheel + " car breaks are pushed");
        return wheel;
    }
}