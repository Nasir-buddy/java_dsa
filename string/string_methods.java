package string;

public class string_methods {
    public static void main(String[] args) {
        // All string methods
        // toUpperCase()
        String str = "nasir ali";
        System.out.println("To Upper case method : " + str.toUpperCase());

        // to LowerCase()
        String str1 = "NASIR ALI";
        System.out.println("To Lower case method : " + str1.toLowerCase());

        // trim();
        String str2 = "   Nasir Ali  ";
        System.out.println("Trim : " + str2.trim());

        // startWith 
        String str3 = "Nasir Ali";
        System.out.println("start with : " + str3.startsWith(str2));

        // end with 
        String str4 = "Nasir Ali";
        System.out.println("end with : " + str4.endsWith(str4));

        //equals 
        System.out.println("Nasir".equals("Nasir"));

        // chatAt VVI for DSA
        System.out.println("Nasir Ali".charAt(3));

        // value of 
        int age = 123;
        String stringAge = String.valueOf(age);
        System.out.println("This is int in age : " + age);
        // + 2 is concating in the string 
        System.out.println("This is string : " + stringAge + 2);

        // replace
        String sentence = "I love Java, Java is a good language";
        String newSentence = sentence.replace("Java", "C");
        System.out.println(newSentence);

        // contains
        String contain = "Nasir Ali";
        System.out.println(contain.contains("Ali"));

        // substring VVI for DSA
        String substr = "My Name is Nasir Ali";
        System.out.println(substr.substring(0,4));

        // Split()

        String splt = "My name is Nasir Ali";
        String words[] = splt.split("a");
        for(String i : words){
            System.out.println(i);
        }
        
        // to char array 
        String clr = "Orange";
        char lettersArray[] = clr.toCharArray();
        for(char i : lettersArray){
            System.out.println(i);
        }

        // isEmpty
        String empt = "";
        System.out.println(empt.isEmpty());
     }
}
