package OOPS4;

public class LearnInterface {
    // Animal a1 = new Animal();
    public static void main(String[] args) {
        LivingThing m1 = new LivingThing();
        m1.eat();
        System.out.println(m1.legs);
    }
}

interface Human {
    void walk();
    void height();
    void age();
}

interface Animal {
    public static final int legs = 4;
    void eat(); // we can remove the abstract method
    void running();
     
}

class LivingThing implements Human, Animal{
    @Override
    public void walk(){
        System.out.println("Person can walk.");
    }
    @Override
    public void height(){
        System.out.println("height is ");
    }
    @Override 
    public void age(){
        System.out.println("Age is ");
    }
    @Override 
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void running(){
        System.out.println("Running");
    }
}


