package generic;

public class generic_method {
    public static void main(String[] args) {
       printData("Hello");
       printData(234);
       printData(true);
    }
    static <G> void printData(G data){
        System.out.println(data);
    }
}
