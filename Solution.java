import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }

}


public class Solution {
    public static void main(String[] args) {
        Class student = Student.class; // uses class literal, not a function.
        Method[] methods = student.getDeclaredMethods();

        /* Get names from Methods */
        ArrayList<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }
        
        /* Sort and print names */
        Collections.sort(methodNames);
        for (String name: methodNames) {
            System.out.println(name);
        }
    }
}