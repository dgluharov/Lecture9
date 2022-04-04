package com.company.HomeworkPerson;

public class CEO extends Person {

    public CEO(String name, int age) {
        super(name, age);
        this.setAge(age);
    }

    @Override
    public void setAge(int age) {
        if (age >= 40) {
            super.setAge(age);
        } else {
            System.out.println("The CEO's age, must at least 40 years");
        }

    }

    @Override
    public void jump() {
        System.out.println("Jump");
    }
}
