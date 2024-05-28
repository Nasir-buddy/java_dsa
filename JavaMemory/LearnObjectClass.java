package JavaMemory;

class Car{
    String model;
    int year;
    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }
    @Override
    public String toString(){ 
        return "Car ka Model " + model + "year is " + year;
    }
     
}
public class LearnObjectClass{
    public static void main(String[] args) {
        Car obj = new Car("Honda City", 2023);
        // to string method is called by java automatically in obj
        System.out.println(obj);
    }
}