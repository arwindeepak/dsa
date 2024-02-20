package oops;

class Student {
    String name;
    static String school;

    public static void newSchool() {
        school = "newschool";
    }
}

public class inheritance {
    public static void main(String[] args) {
        Student.school = "arwwin";
        Student t1 = new Student();
        t1.name = "aaanchal";
        System.out.println(Student.school); // Accessing static variable using class name
        System.out.println(t1.name); // Accessing instance variable using instance reference
    }
}

