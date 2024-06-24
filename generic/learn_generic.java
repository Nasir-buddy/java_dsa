package generic;

public class learn_generic {
    public static void main(String[] args) {
        Animal<String, Integer> a1 = new Animal<>("Dog", 34);
        Animal<Integer, String> a2 = new Animal<>(34, "Adarsh");
        System.out.println(a1.getName());
       
    }
}
class Animal<G, E>{
    G name;
    E id;

    public Animal(G name, E id){
        this.name = name; 
        this.id = id;      
    }
    G getName(){
        return name;
    }
}