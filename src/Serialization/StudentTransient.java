package Serialization;

import java.io.Serializable;

public class StudentTransient implements Serializable {
    public int studentId;
    public String name;
    public transient int mark; //The transient keyword in Java is used to indicate that a field of a class should not be serialized. it will return the defult value.
}
