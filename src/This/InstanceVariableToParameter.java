//This can be used to refer the current class instance variable.
package This;

class Student{
    int id;
    String name;
    float fees;
    Student(int id,String name,float fees){
        this.id = id;
        this.name = name;
        this.fees = fees;
    }
    void display(){
        System.out.println(id+" "+name+" "+fees+" ");
    }
}
public class InstanceVariableToParameter {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Amritesh",1223456);
        Student s2 = new Student(1,"Diti",1223456);
       s1.display();
       s2.display();
    }
}
