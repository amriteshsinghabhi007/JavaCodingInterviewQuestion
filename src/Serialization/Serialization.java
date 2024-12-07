package Serialization;

import java.io.*;

//Object to byte stream (memory,DB,file)
//use ObjectOutputStream class and method writeObject for Serialization
public class Serialization {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.studentId = 1;
       s1.name = "Amritesh";
       s1.mark = 80;

       String fileName = "C:\\Users\\91962\\IdeaProjects\\Test.txt";
       try {
           FileOutputStream fos = new FileOutputStream(fileName); // write into the file use FileOutputStream
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(s1);

           fos.close();
           oos.close();
           System.out.println("Object is created");

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}
