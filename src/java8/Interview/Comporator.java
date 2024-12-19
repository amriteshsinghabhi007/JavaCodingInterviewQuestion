package java8.Interview;

import java8.TerminalOpration.Employee;

import java.util.*;

public class Comporator {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1,"Amritesh",8.0),
                new Student(2,"Suraj",10.9),
                new Student(3,"Shashank",4.9),
                new Student(4,"Diptee",3.9));

        Comparator<Student> comparing = Comparator.comparing(Student::getMarks).reversed().thenComparing(Student::getName);
        Collections.sort(students,comparing);
        for(Student s : students){
            System.out.println(s.getName()+ " : " +s.getMarks());
        }
    }
}
