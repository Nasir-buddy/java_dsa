package JavaMemory;

class Data{
    int data = 5;
    public void printData(){
        System.out.println(data);
    }
}
class ChildData extends Data{
    public void printData(){
        System.out.println("overridden data " + data);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Data d = new Data();
        d = new ChildData();
        d.printData();
    }
}
