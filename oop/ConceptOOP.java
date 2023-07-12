package oop;




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
        System.out.println(name+ " " + age);
    }

    // Student() {
    // };
}

public class ConceptOOP {
    public static void main(String args[]) {
        Student s1 = new Student();

        s1.name = "Archy";
        s1.age = 24;

        // Student s2 = new Student();
        // s2.printInfo(null);
        s1.printInfo(s1.name);
    }
}
