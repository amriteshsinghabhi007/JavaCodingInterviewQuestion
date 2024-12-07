package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
//byte stream to object
//use ObjectInputStream class and method readObject for DeSerialization
public class DeSerialization {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\91962\\IdeaProjects\\Test.txt";
        try {
            FileInputStream fis = new FileInputStream(fileName);// read from the file
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student obj = (Student)ois.readObject();

            fis.close();
            ois.close();
            System.out.println("id:- "+obj.studentId);
            System.out.println("Name:- "+obj.name);
            System.out.println("mark:- "+obj.mark);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
