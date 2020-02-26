package org.example;

public class Student
{

    private String name;
    private boolean pass = false;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args ) {

    }

    public boolean passed() {
        return pass;
    }

    public void assigmentDone() {
        pass = true;
    }
}
