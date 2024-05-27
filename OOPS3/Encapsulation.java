package OOPS3;

import OOPS3.LearnPackage.Person;

public interface Encapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(12);
        System.out.println(p1.getAge());
    }
}
