
import java.io.*;
import java.util.Arrays;

class Student{
    int roll;
    String name;
    Student(int r, String n)
    {
        roll = r;
        name = n;
    }
    void swap(int a, int b)
    {
        int temp =a;
        a = b;
        b = temp;
    }
}
class Practice{
    public static void main()
    {
        Integer a = 6;
        Integer b = 9;
        Student s = new Student(1, "Amruta");
        s.swap(a, b);
        System.out.println(a + " " + b);
    } 
}