package OOPS3.LearnPackage;

public class Person {
    private int age;
    private int height;
    private String name;


    boolean checkAge = false;

    public void setAge(int age){
        if(checkAge == true){
            this.age = age;
        }
    }
    public void setHeigth(int height){
        this.height = height;
    }
    public int getAge(){
        return age;
    }
}
