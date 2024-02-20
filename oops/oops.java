package oops;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("pen will be wrirting somethiing on the copy");
    }

    public void print() {

        System.out.println(this.color);
        System.out.println(this.type);
    }

}

class Student {
    String name;
    int age;

    public void printInfo(String name) {
          System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
    System.out.println("nsame is "+ name +"age is "+ age);
   }

}
public class oops {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.printInfo("arwin");
        obj.printInfo(90);
        obj.printInfo("arwin ", 19);
       
       
        
    }
}
