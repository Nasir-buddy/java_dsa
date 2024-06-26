package Collection_FrameWOrk;

import java.util.*;

public class HashSet_Framework {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        Student s1 = new Student(72, "Nasir Ali");
        Student s2 = new Student(72, "Ali");

        System.out.println(s1.equals(s2));


        set.add(new Student(72, "Nasir Ali"));
        set.add(new Student(72, "Nasir Ali"));
        set.add(new Student(7, "Nasir Ali"));

        System.out.println(set);
    }
}

class Student {
    int rollNo;
    String name;
   
    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }

    
    
}