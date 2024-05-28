package JavaMemory;

class Data{
    int data = 5;
    public void printData(){
        System.out.println(data);
    }
    public void printData(int times){
        for(int i = 0; i < times; i++){
            System.out.println(data);
        }
    }
}
class ChildData extends Data{
    public void printData(){
        System.out.println("overridden data " + data);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        // this is run time polymorphism
        Data d = new Data();
        d = new ChildData();
        d.printData(); // Run time polymorphism also called method overloading

        Data d2 = new Data();
        d2.printData(2); // compile time polymorphism also called method overloading
    }
}
