package generic;

public class generic_method {
    public static void main(String[] args) {
       printData("Hello");
       printData(234);
       printData(true);

        generic_method obj = new generic_method();
        obj.Data(345);
        obj.Data("Nasir Ali");
    }
    static <G> void printData(G data){
        System.out.println(data);
    }

    <V> void Data(V data){
        System.out.println(data);
    }
}
