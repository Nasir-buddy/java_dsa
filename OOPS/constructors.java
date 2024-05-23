package OOPS;

public class constructors {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(23,3);
        ComplexNumber num2 = new ComplexNumber(5, 9);
        num1.print();
        num2.print();
    }
}
class ComplexNumber{
    int a; 
    int b;

    //constructor
    public ComplexNumber(int real, int imaginary){
        a = real;
        b = imaginary;
    }

    void print(){
        System.out.println(a + " + " + b + "i");
    }
}