package customSet;

import java.util.HashSet;
import java.util.Set;

public class CustomSet {
    public static void main(String[] args)
    {
        Set<Student> myStudent = new HashSet<>();
        myStudent.add(new Student("Ashik",23));
        myStudent.add(new Student("Rohit",23));
        myStudent.add(new Student("Adib",3));
        myStudent.add(new Student("Fatik",43));

        System.out.println(myStudent);
    }

}
