package string;
public class stringg{
    public static void main(String[] args) {
        // save in heap memory called string constant pool
        // java is case sensitive.
       String str = "Nasir Ali";
       System.out.println(str);
       String str1 = new String("Nasir Ali");
       System.out.println(str1);

       if(str == str1){
        System.out.println("both are same");
       } else {
        System.out.println("both are not same");
       }

       // comparing the value in the string 
       if(str.equals(str1)){
        System.out.println("both are same");
       } else {
        System.out.println("Both are not same");
       }
    }
}