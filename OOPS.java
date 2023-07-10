class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

}


class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // paramarized constructor
    // Student(String name, int age) {
    //     // System.out.println("constructor invoked");
    //     this.name = name;
    //     this.age = age;
    // }

    // copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
    }

    // non paramized constructor
    Student() {
        
    }
}
    
public class OOPS {
    public static void main(String args[]) {
        // Pen pen1 = new Pen();

        // pen1.color = "pink";
        // pen1.type = "Ballpen";

        //  Pen pen2 = new Pen();

        // pen2.color = "Orange";
        // pen2.type = "inkpen";

        // pen1.write();

        // pen1.printColor();
        // pen2.printColor();

        Student s1 = new Student();

        s1.name = "Archana Pant";
        s1.age = 34;

        Student s2 = new Student(s1);
        s2.printInfo();


    }
}