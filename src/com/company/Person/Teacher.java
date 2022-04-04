package com.company.Person;

public class Teacher extends Person {
    private String[] teachingClass;

    public Teacher(String name, int age, int height, String[] teachingClass) {
        super(name, age, height);
        this.teachingClass = teachingClass;
    }

    public String[] getTeachingClass() {
        return teachingClass;
    }

    public void setTeachingClass(String[] teachingClass) {
        this.teachingClass = teachingClass;
    }
}
