package generic;

public class learn_generic {
    public static void main(String[] args) {
        Animal<String> a1 = new Animal<>("Dog");
        Animal<Integer> a2 = new Animal<>(34);
    }
}
class Animal<G>{
    G name;

    public Animal(G name){
        this.name = name;
        
    }
}