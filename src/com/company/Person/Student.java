package com.company.Person;


public class Student extends Person {
    private String[] takingClasses;

    public Student(String name, int age, int height, String[] takingClasses) {
        super(name, age, height);
        this.takingClasses = takingClasses;
    }

    public String[] getTakingClasses() {
        return takingClasses;
    }

    public void setTakingClasses(String[] takingClasses) {
        this.takingClasses = takingClasses;
    }
}
