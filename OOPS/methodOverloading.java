package OOPS;

public class methodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings("Nasir");
        obj.greetings();
    }
}

class Greet{
    void greetings(){
        System.out.println("Hello good morning.");
    }
    
    void greetings(String name){
        System.out.println("Hello "+ name + ", Good morning.");
    }
}