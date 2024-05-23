package OOPS;

public class oops1 {
    public static void main(String[] args) {
        bike ZX10R = new bike();
        ZX10R.name = "Kawasaki";
        ZX10R.cc = 999;
        ZX10R.speed();

        bike ss1000 = new bike();
        ss1000.name = "BMW";
        ss1000.cc = 999;
        ss1000.milage();
    }
}
// classes is stored in meta space
class bike {
    String name;
    String psPower;    
    int cc;
    void speed(){
        System.out.println(name + " Bike is speeding.");
    }
    void milage(){
        System.out.println(name + " milage is good.");
    }
}
class car{
    String name;
    String psPower;
    int cc;
    
}